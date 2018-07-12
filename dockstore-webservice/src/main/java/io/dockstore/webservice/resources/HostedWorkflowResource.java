/*
 *    Copyright 2018 OICR
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package io.dockstore.webservice.resources;

import java.util.Date;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import io.dockstore.common.SourceControl;
import io.dockstore.webservice.CustomWebApplicationException;
import io.dockstore.webservice.core.Entry;
import io.dockstore.webservice.core.SourceFile;
import io.dockstore.webservice.core.User;
import io.dockstore.webservice.core.Version;
import io.dockstore.webservice.core.Workflow;
import io.dockstore.webservice.core.WorkflowMode;
import io.dockstore.webservice.core.WorkflowVersion;
import io.dockstore.webservice.jdbi.FileDAO;
import io.dockstore.webservice.jdbi.UserDAO;
import io.dockstore.webservice.jdbi.WorkflowDAO;
import io.dockstore.webservice.jdbi.WorkflowVersionDAO;
import io.dockstore.webservice.languages.LanguageHandlerFactory;
import io.dockstore.webservice.permissions.PermissionsInterface;
import io.dockstore.webservice.permissions.Role;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

import static io.dockstore.webservice.Constants.JWT_SECURITY_DEFINITION_NAME;

/**
 * @author dyuen
 */
@Api("hosted")
@Path("/workflows")
public class HostedWorkflowResource extends AbstractHostedEntryResource<Workflow, WorkflowVersion, WorkflowDAO, WorkflowVersionDAO> {
    private final WorkflowDAO workflowDAO;
    private final WorkflowVersionDAO workflowVersionDAO;
    private final PermissionsInterface permissionsInterface;

    public HostedWorkflowResource(UserDAO userDAO, WorkflowDAO workflowDAO, WorkflowVersionDAO workflowVersionDAO, FileDAO fileDAO,
            PermissionsInterface permissionsInterface) {
        super(fileDAO, userDAO, permissionsInterface);
        this.workflowVersionDAO = workflowVersionDAO;
        this.workflowDAO = workflowDAO;
        this.permissionsInterface = permissionsInterface;
    }

    @Override
    protected WorkflowDAO getEntryDAO() {
        return workflowDAO;
    }

    @Override
    protected WorkflowVersionDAO getVersionDAO() {
        return workflowVersionDAO;
    }

    @Override
    @ApiOperation(nickname = "createHostedWorkflow", value = "Create a hosted workflow", authorizations = {
        @Authorization(value = JWT_SECURITY_DEFINITION_NAME) }, notes = "Create a hosted workflow", response = Workflow.class)
    public Workflow createHosted(User user, String registry, String name, String descriptorType, String namespace) {
        return super.createHosted(user, registry, name, descriptorType, namespace);
    }

    @Override
    @ApiOperation(nickname = "hostedWorkflowOptions", value = "Options for a hosted workflow", authorizations = {
            @Authorization(value = JWT_SECURITY_DEFINITION_NAME) }, notes = "Options for a hosted workflow")
    public Response hostedEntryOptions(Optional<User> optionalUser, Long entryId) {
        return super.hostedEntryOptions(optionalUser, entryId);
    }

    @Override
    public void checkUserCanRead(User user, Entry entry) {
        checkUserCanDoAction(user, entry, Role.Action.READ);
    }

    @Override
    public void checkUserCanUpdate(User user, Entry entry) {
        checkUserCanDoAction(user, entry, Role.Action.WRITE);
    }

    @Override
    public void checkUserCanDelete(User user, Entry entry) {
        checkUserCanDoAction(user, entry, Role.Action.DELETE);
    }

    private void checkUserCanDoAction(User user, Entry entry, Role.Action action) {
        try {
            checkUser(user, entry); // Checks if owner, which has all permissions.
        } catch (CustomWebApplicationException ex) {
            if (!(entry instanceof Workflow) || !permissionsInterface.canDoAction(user, (Workflow)entry, action)) {
                throw ex;
            }
        }
    }

    @Override
    protected Workflow getEntry(User user, String registry, String name, String descriptorType, String namespace) {
        Workflow workflow = new Workflow();
        workflow.setMode(WorkflowMode.HOSTED);
        // TODO: We set the organization to the username of the user creating it. However, for gmail accounts this is an
        // email. This might not be a good idea. Especially if users don't want their emails displayed.
        workflow.setOrganization(user.getUsername());
        workflow.setRepository(name);
        workflow.setSourceControl(SourceControl.DOCKSTORE);
        workflow.setDescriptorType(descriptorType);
        workflow.setLastUpdated(new Date());
        workflow.getUsers().add(user);
        return workflow;
    }

    @Override
    @ApiOperation(nickname = "editHostedWorkflow", value = "Non-idempotent operation for creating new revisions of hosted workflows", authorizations = {
        @Authorization(value = JWT_SECURITY_DEFINITION_NAME) }, notes = "Non-idempotent operation for creating new revisions of hosted workflows", response = Workflow.class)
    public Workflow editHosted(User user, Long entryId, Set<SourceFile> sourceFiles) {
        return super.editHosted(user, entryId, sourceFiles);
    }

    @Override
    protected WorkflowVersion getVersion(Workflow workflow) {
        WorkflowVersion version = new WorkflowVersion();
        version.setReferenceType(Version.ReferenceType.TAG);
        version.setWorkflowPath("/Dockstore." + workflow.getDescriptorType());
        version.setLastModified(new Date());
        return version;
    }

    @Override
    @ApiOperation(nickname = "deleteHostedWorkflowVersion", value = "Delete a revision of a hosted workflow", authorizations = {
        @Authorization(value = JWT_SECURITY_DEFINITION_NAME) }, notes = "Delete a revision of a hosted workflow", response = Workflow.class)
    public Workflow deleteHostedVersion(User user, Long entryId, String version) {
        return super.deleteHostedVersion(user, entryId, version);
    }

    @Override
    protected boolean checkValidVersion(Set<SourceFile> sourceFiles, Workflow entry) {
        SourceFile.FileType identifiedType = entry.getFileType();
        String mainDescriptorPath = "/Dockstore." + entry.getDescriptorType().toLowerCase();
        for (SourceFile sourceFile : sourceFiles) {
            if (Objects.equals(sourceFile.getPath(), mainDescriptorPath)) {
                return LanguageHandlerFactory.getInterface(identifiedType).isValidWorkflow(sourceFile.getContent());
            }
        }
        return false;
    }
}
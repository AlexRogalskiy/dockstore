/*
 *    Copyright 2017 OICR
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

import java.util.List;

import io.dockstore.webservice.CustomWebApplicationException;
import io.dockstore.webservice.core.Entry;
import io.dockstore.webservice.core.User;
import org.apache.http.HttpStatus;

/**
 * Endpoints that use authentication by Dockstore user
 */
public interface AuthenticatedResourceInterface {

    /**
     * Check if tool is null
     *
     * @param entry
     */
    default void checkEntry(Entry entry) {
        if (entry == null) {
            throw new CustomWebApplicationException("Entry not found", HttpStatus.SC_BAD_REQUEST);
        }
    }

    /**
     * Check if tool is null
     *
     * @param entry
     */
    default void checkEntry(List<? extends Entry> entry) {
        if (entry == null) {
            throw new CustomWebApplicationException("No entries provided", HttpStatus.SC_BAD_REQUEST);
        }
        entry.forEach(this::checkEntry);
    }

    /**
     * Check if admin or if tool belongs to user
     *
     * @param user
     * @param entry
     */
    default void checkUser(User user, Entry entry) {
        if (!user.getIsAdmin() && (entry.getUsers()).stream().noneMatch(u -> ((User)(u)).getId() == user.getId())) {
            throw new CustomWebApplicationException("Forbidden: you do not have the credentials required to access this entry.",
                    HttpStatus.SC_FORBIDDEN);
        }
    }

    /**
     * Check if admin or if container belongs to user
     *
     * @param user
     * @param list
     */
    static void checkUser(User user, List<? extends Entry> list) {
        for (Entry entry : list) {
            if (!user.getIsAdmin() && (entry.getUsers()).stream().noneMatch(u -> ((User)(u)).getId() == user.getId())) {
                throw new CustomWebApplicationException("Forbidden: you do not have the credentials required to access this entry.",
                    HttpStatus.SC_FORBIDDEN);
            }
        }
    }

    /**
     * Check if admin or correct user
     *
     * @param user
     * @param id
     */
    default void checkUser(User user, long id) {
        if (!user.getIsAdmin() && user.getId() != id) {
            throw new CustomWebApplicationException("Forbidden: please check your credentials.", HttpStatus.SC_FORBIDDEN);
        }
    }

    /**
     * Checks if a user can read an entry. Default implementation
     * is to invoke <code>checkUser</code>. Implmenations that support
     * more nuanched sharing should override.
     * @param user
     * @param entry
     */
    default void checkUserCanRead(User user, Entry entry) {
        checkUser(user, entry);
    }

    /**
     * Checks if a user can modify an entry. Default implementation
     * is to invoke <code>checkUser</code>. Implementations that support
     * more nuanced sharing should override.
     *
     * @param user
     * @param entry
     */
    default void checkUserCanUpdate(User user, Entry entry) {
        checkUser(user, entry);
    }

    /**
     * Checks if a user can delete an entry. Default implementation
     * is to invoke <code>checkUser</code>. Implementations that support
     * more nuanced sharing should override.
     *
     * @param user
     * @param entry
     */
    default void checkUserCanDelete(User user, Entry entry) {
        checkUser(user, entry);
    }

    /**
     * Checks is a user can share an entry. Default implementation
     * is to invoke <code>checkUser</code>. Implmentations that support
     * more nuanced sharing should override.
     *
     * @param user
     * @param entry
     */
    default void checkUserCanShare(User user, Entry entry) {
        checkUser(user, entry);
    }

}
package io.dockstore.webservice.core;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * This describes a Dockstore collection that can be associated with an organization.
 *
 * @author aduncan
 */
@ApiModel("Collection")
@Schema(name = "Collection", description = "Collection in an organization, collects entries")
@Entity
@Table(name = "collection")
@NamedQueries({
        @NamedQuery(name = "io.dockstore.webservice.core.Collection.findAllByOrg", query = "SELECT col FROM Collection col WHERE organizationid = :organizationId"),
        @NamedQuery(name = "io.dockstore.webservice.core.Collection.findByNameAndOrg", query = "SELECT col FROM Collection col WHERE col.name = :name AND organizationid = :organizationId"),
})
@SuppressWarnings("checkstyle:magicnumber")
public class Collection implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "Implementation specific ID for the collection in this web service", position = 0)
    @Schema(description = "Implementation specific ID for the collection in this web service")
    private long id;

    @Column(nullable = false, unique = true)
    @Pattern(regexp = "[a-zA-Z][a-zA-Z\\d]*")
    @Size(min = 3, max = 39)
    @ApiModelProperty(value = "Name of the collection.", required = true, example = "Alignment", position = 1)
    @Schema(description = "Name of the collection", required = true, example = "Alignment")
    private String name;

    @Column(columnDefinition = "TEXT")
    @ApiModelProperty(value = "Description of the collection", position = 2)
    @Schema(description = "Description of the collection", required = true, example = "Alignment")
    private String description;

    @Column(nullable = false, unique = true)
    @Pattern(regexp = "[\\w ,_\\-&()']*")
    @Size(min = 3, max = 50)
    @ApiModelProperty(value = "Display name for a collection (Ex. Recommended Alignment Algorithms). Not used for links.", position = 3)
    private String displayName;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "collection_entry", joinColumns = @JoinColumn(name = "collectionid"), inverseJoinColumns = @JoinColumn(name = "entryid"))
    private Set<Entry> entries = new HashSet<>();

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organizationid")
    private Organization organization;

    @Column(updatable = false)
    @CreationTimestamp
    private Timestamp dbCreateDate;

    @Column()
    @UpdateTimestamp
    private Timestamp dbUpdateDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Entry> getEntries() {
        return entries;
    }

    public void setEntries(Set<Entry> entries) {
        this.entries = entries;
    }

    public void addEntry(Entry entry) {
        this.entries.add(entry);
    }

    public void removeEntry(Entry entry) {
        this.entries.remove(entry);
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Timestamp getDbCreateDate() {
        return dbCreateDate;
    }

    public void setDbCreateDate(Timestamp dbCreateDate) {
        this.dbCreateDate = dbCreateDate;
    }

    public Timestamp getDbUpdateDate() {
        return dbUpdateDate;
    }

    public void setDbUpdateDate(Timestamp dbUpdateDate) {
        this.dbUpdateDate = dbUpdateDate;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
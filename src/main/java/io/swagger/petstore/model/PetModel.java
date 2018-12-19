
package io.swagger.petstore.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "category",
    "name",
    "photoUrls",
    "tags",
    "status"
})
public class PetModel {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("category")
    private Category category;
    @JsonProperty("name")
    private String name;
    @JsonProperty("photoUrls")
    private List<String> photoUrls = null;
    @JsonProperty("tags")
    private List<Tag> tags = null;
    @JsonProperty("status")
    private String status;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PetModel() {
    }

    /**
     * 
     * @param tags
     * @param id
     * @param category
     * @param status
     * @param name
     * @param photoUrls
     */
    public PetModel(Integer id, Category category, String name, List<String> photoUrls, List<Tag> tags, String status) {
        super();
        this.id = id;
        this.category = category;
        this.name = name;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Category category) {
        this.category = category;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("photoUrls")
    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    @JsonProperty("photoUrls")
    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("category", category).append("name", name).append("photoUrls", photoUrls).append("tags", tags).append("status", status).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tags).append(id).append(category).append(status).append(name).append(photoUrls).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PetModel) == false) {
            return false;
        }
        PetModel rhs = ((PetModel) other);
        return new EqualsBuilder().append(tags, rhs.tags).append(id, rhs.id).append(category, rhs.category).append(status, rhs.status).append(name, rhs.name).append(photoUrls, rhs.photoUrls).isEquals();
    }

}

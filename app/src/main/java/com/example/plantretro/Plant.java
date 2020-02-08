
package com.example.plantretro;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Plant {

    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("scientific_name")
    @Expose
    private String scientificName;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("complete_data")
    @Expose
    private Boolean completeData;
    @SerializedName("common_name")
    @Expose
    private String commonName;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getCompleteData() {
        return completeData;
    }

    public void setCompleteData(Boolean completeData) {
        this.completeData = completeData;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

}

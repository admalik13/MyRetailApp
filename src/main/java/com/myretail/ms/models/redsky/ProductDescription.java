package com.myretail.ms.models.redsky;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProductDescription {
    @JsonProperty("title")
    private String title;
    @JsonProperty("bullet_description")
    private List<String> bulletDescription;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getBulletDescription() {
        return bulletDescription;
    }

    public void setBulletDescription(List<String> bulletDescription) {
        this.bulletDescription = bulletDescription;
    }
}

package com.myretail.ms.models.redsky;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Image {

    @JsonProperty("base_url")
    private String baseUrl;
    @JsonProperty("primary")
    private String primary;
    @JsonProperty("content_labels")
    private List<ContentLabel> contentLabels;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public List<ContentLabel> getContentLabels() {
        return contentLabels;
    }

    public void setContentLabels(List<ContentLabel> contentLabels) {
        this.contentLabels = contentLabels;
    }
}

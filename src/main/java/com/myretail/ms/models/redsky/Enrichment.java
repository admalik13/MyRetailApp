package com.myretail.ms.models.redsky;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Enrichment {

    @JsonProperty("images")
    private List<Image> images;
    @JsonProperty("sales_classification_nodes")
    private List<SalesClassificationNode> salesClassificationNodes;

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<SalesClassificationNode> getSalesClassificationNodes() {
        return salesClassificationNodes;
    }

    public void setSalesClassificationNodes(List<SalesClassificationNode> salesClassificationNodes) {
        this.salesClassificationNodes = salesClassificationNodes;
    }
}

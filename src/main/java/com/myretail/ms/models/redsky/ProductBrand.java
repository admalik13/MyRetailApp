package com.myretail.ms.models.redsky;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductBrand {
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("facet_id")
    private String facetId;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFacetId() {
        return facetId;
    }

    public void setFacetId(String facetId) {
        this.facetId = facetId;
    }
}

package com.myretail.ms.models.redsky;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PackageDimensions {
    @JsonProperty("weight")
    private String weight;
    @JsonProperty("weight_unit_of_measure")
    private String weightUnitOfMeasure;
    @JsonProperty("width")
    private String width;
    @JsonProperty("depth")
    private String depth;
    @JsonProperty("height")
    private String height;
    @JsonProperty("dimension_unit_of_measure")
    private String dimensionUnitOfMeasure;

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeightUnitOfMeasure() {
        return weightUnitOfMeasure;
    }

    public void setWeightUnitOfMeasure(String weightUnitOfMeasure) {
        this.weightUnitOfMeasure = weightUnitOfMeasure;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getDimensionUnitOfMeasure() {
        return dimensionUnitOfMeasure;
    }

    public void setDimensionUnitOfMeasure(String dimensionUnitOfMeasure) {
        this.dimensionUnitOfMeasure = dimensionUnitOfMeasure;
    }
}

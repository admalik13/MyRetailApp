package com.myretail.ms.models.redsky;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductVendor {
    @JsonProperty("id")
    private String id;
    @JsonProperty("manufacturer_style")
    private String manufacturerStyle;
    @JsonProperty("vendor_name")
    private String vendorName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManufacturerStyle() {
        return manufacturerStyle;
    }

    public void setManufacturerStyle(String manufacturerStyle) {
        this.manufacturerStyle = manufacturerStyle;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
}

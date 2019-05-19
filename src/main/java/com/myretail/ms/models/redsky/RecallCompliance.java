package com.myretail.ms.models.redsky;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RecallCompliance {
    @JsonProperty("is_product_recalled")
    private Boolean isProductRecalled;

    public Boolean getProductRecalled() {
        return isProductRecalled;
    }

    public void setProductRecalled(Boolean productRecalled) {
        isProductRecalled = productRecalled;
    }
}

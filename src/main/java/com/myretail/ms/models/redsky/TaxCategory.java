package com.myretail.ms.models.redsky;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TaxCategory {
    @JsonProperty("tax_class")
    private String taxClass;
    @JsonProperty("tax_code_id")
    private Integer taxCodeId;
    @JsonProperty("tax_code")
    private String taxCode;

    public String getTaxClass() {
        return taxClass;
    }

    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }

    public Integer getTaxCodeId() {
        return taxCodeId;
    }

    public void setTaxCodeId(Integer taxCodeId) {
        this.taxCodeId = taxCodeId;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }
}

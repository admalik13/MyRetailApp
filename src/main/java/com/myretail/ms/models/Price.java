package com.myretail.ms.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Price {
    @JsonProperty("value")
    private Float value;
    @JsonProperty("currency_code")
    private String currencyCode;

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}

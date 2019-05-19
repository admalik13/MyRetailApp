package com.myretail.ms.models.redsky;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DisplayOption {
    @JsonProperty("is_size_chart")
    private Boolean isSizeChart;
    @JsonProperty("is_warranty")
    private Boolean isWarranty;

    public Boolean getSizeChart() {
        return isSizeChart;
    }

    public void setSizeChart(Boolean sizeChart) {
        isSizeChart = sizeChart;
    }

    public Boolean getWarranty() {
        return isWarranty;
    }

    public void setWarranty(Boolean warranty) {
        isWarranty = warranty;
    }
}

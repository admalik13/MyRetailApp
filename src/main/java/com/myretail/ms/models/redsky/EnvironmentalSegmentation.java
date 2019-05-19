package com.myretail.ms.models.redsky;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EnvironmentalSegmentation {
    @JsonProperty("is_lead_disclosure")
    private Boolean isLeadDisclosure;

    public Boolean getLeadDisclosure() {
        return isLeadDisclosure;
    }

    public void setLeadDisclosure(Boolean leadDisclosure) {
        isLeadDisclosure = leadDisclosure;
    }
}

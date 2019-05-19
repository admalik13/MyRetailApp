package com.myretail.ms.models.redsky;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fulfillment {

    @JsonProperty("is_po_box_prohibited")
    private Boolean isPoBoxProhibited;
    @JsonProperty("po_box_prohibited_message")
    private String poBoxProhibitedMessage;

    public Boolean getPoBoxProhibited() {
        return isPoBoxProhibited;
    }

    public void setPoBoxProhibited(Boolean poBoxProhibited) {
        isPoBoxProhibited = poBoxProhibited;
    }

    public String getPoBoxProhibitedMessage() {
        return poBoxProhibitedMessage;
    }

    public void setPoBoxProhibitedMessage(String poBoxProhibitedMessage) {
        this.poBoxProhibitedMessage = poBoxProhibitedMessage;
    }
}

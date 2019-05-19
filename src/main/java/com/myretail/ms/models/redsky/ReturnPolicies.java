package com.myretail.ms.models.redsky;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReturnPolicies {
    @JsonProperty("user")
    private String user;
    @JsonProperty("policyDays")
    private String policyDays;
    @JsonProperty("guestMessage")
    private String guestMessage;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPolicyDays() {
        return policyDays;
    }

    public void setPolicyDays(String policyDays) {
        this.policyDays = policyDays;
    }

    public String getGuestMessage() {
        return guestMessage;
    }

    public void setGuestMessage(String guestMessage) {
        this.guestMessage = guestMessage;
    }
}

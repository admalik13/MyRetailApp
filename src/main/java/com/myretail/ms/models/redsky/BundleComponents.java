package com.myretail.ms.models.redsky;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BundleComponents {
    @JsonProperty("is_kit_master")
    private Boolean isKitMaster;
    @JsonProperty("is_component")
    private Boolean isComponent;

    public Boolean getKitMaster() {
        return isKitMaster;
    }

    public void setKitMaster(Boolean kitMaster) {
        isKitMaster = kitMaster;
    }

    public Boolean getComponent() {
        return isComponent;
    }

    public void setComponent(Boolean component) {
        isComponent = component;
    }
}

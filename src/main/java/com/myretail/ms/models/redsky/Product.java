package com.myretail.ms.models.redsky;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
    @JsonProperty("deep_red_labels")
    private DeepRedLabels deepRedLabels;

    @JsonProperty("available_to_promise_network")
    private AvailableToPromiseNetwork availableToPromiseNetwork;

    @JsonProperty("item")
    private Item item;

    public DeepRedLabels getDeepRedLabels() {
        return deepRedLabels;
    }

    public void setDeepRedLabels(DeepRedLabels deepRedLabels) {
        this.deepRedLabels = deepRedLabels;
    }

    public AvailableToPromiseNetwork getAvailableToPromiseNetwork() {
        return availableToPromiseNetwork;
    }

    public void setAvailableToPromiseNetwork(AvailableToPromiseNetwork availableToPromiseNetwork) {
        this.availableToPromiseNetwork = availableToPromiseNetwork;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}

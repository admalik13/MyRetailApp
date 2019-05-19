package com.myretail.ms.models.redsky;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SalesClassificationNode {
    @JsonProperty("node_id")
    private String nodeId;

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }
}

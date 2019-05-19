package com.myretail.ms.models.redsky;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DeepRedLabels {

    @JsonProperty("total_count")
    private Integer totalCount;

    @JsonProperty("labels")
    private List<Label> labels;
}

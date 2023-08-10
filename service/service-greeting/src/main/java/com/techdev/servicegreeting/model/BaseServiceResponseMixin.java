package com.techdev.servicegreeting.model;

import com.fasterxml.jackson.annotation.JsonInclude;

public abstract class BaseServiceResponseMixin {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public abstract String getId();
}

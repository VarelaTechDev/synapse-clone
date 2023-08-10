package com.techdev.servicegreeting.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.americanexpress.synapse.service.rest.model.BaseServiceResponse;

import java.util.Objects;

public class GreetingResponse extends BaseServiceResponse {
    private String message;


    public GreetingResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "GreetingResponse{" +
                "message='" + message + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GreetingResponse that = (GreetingResponse) o;

        return Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return message != null ? message.hashCode() : 0;
    }
}

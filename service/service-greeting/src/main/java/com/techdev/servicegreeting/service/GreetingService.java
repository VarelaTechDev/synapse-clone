package com.techdev.servicegreeting.service;

import com.techdev.servicegreeting.model.GreetingResponse;

import io.americanexpress.synapse.service.rest.model.ServiceHeaders;
import io.americanexpress.synapse.service.rest.service.BaseService;
import org.springframework.stereotype.Service;

import static java.util.Objects.nonNull;

// BaseService<GreetingRequest, GreetingResponse> {cle
@Service
public class GreetingService extends BaseService{


    private static final String template = "Hello, %s!";

    public GreetingResponse getGreet(String user) {
        if(nonNull(user)){
            return new GreetingResponse(String.format(template, user));
        }

        return new GreetingResponse(String.format(template, "World!"));

    }
}

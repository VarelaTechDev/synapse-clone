package com.techdev.servicegreeting;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.techdev.servicegreeting.model.BaseServiceResponseMixin;
import io.americanexpress.synapse.service.rest.model.BaseServiceResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServiceGreetingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceGreetingApplication.class, args);
    }

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        // Add the mix-in to the ObjectMapper
        mapper.addMixIn(BaseServiceResponse.class, BaseServiceResponseMixin.class);
        return mapper;
    }

    // This removes the null field
//    @Bean
//    public Jackson2ObjectMapperBuilderCustomizer jsonCustomizer() {
//        return builder -> {
//            builder.serializationInclusion(JsonInclude.Include.NON_NULL);
//        };
//    }

}

package com.techdev.servicegreeting.controller;

import com.techdev.servicegreeting.model.GreetingResponse;
import com.techdev.servicegreeting.service.GreetingService;
import io.americanexpress.synapse.service.rest.controller.BaseController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingController extends BaseController<GreetingService> {

    @PostMapping
    public GreetingResponse greet(@RequestParam(value = "name", required = false) String name) {
        if (name != null && !name.isEmpty()) {
            return service.getGreet(name);

        }
        // Handle the case where 'name' parameter is not provided
        return service.getGreet(null);
    }


}

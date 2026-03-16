package com.my.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.name}")
    private String environment;

    @GetMapping("/env")
    public String getEnvironment() {
        return "Running in: " + environment;
    }
}
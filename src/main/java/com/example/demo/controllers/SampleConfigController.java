package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleConfigController {

    @Value("${com.example.config_param1}")
    private String configParam1;

    @Value("${com.example.config_param2}")
    private String configParam2;

    @GetMapping(value = "/config/{paramName}", produces = "application/json")
    public String getParamValue(@PathVariable String paramName) {
        switch (paramName) {
            case "config_param1": return configParam1;
            case "config_param2": return configParam2;
            default: return "Unknown";
        }
    }
}

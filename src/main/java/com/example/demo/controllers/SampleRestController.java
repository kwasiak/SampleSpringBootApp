package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SampleRestController {

    @GetMapping(path="/api", produces = "application/json")
    public Map<String, String> sampleApiHandler() {
        HashMap<String, String> response = new HashMap<>();
        response.put("field1", "value1");
        response.put("field2", "value2");
        return response;
    }

}

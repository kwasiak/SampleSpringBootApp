package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @GetMapping(value = "/html/{sampleParam}", produces = "text/html")
    public @ResponseBody String getSampleString(@PathVariable String sampleParam) {
        return sampleParam;
    }
}

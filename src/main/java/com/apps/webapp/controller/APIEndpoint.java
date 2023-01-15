package com.apps.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIEndpoint {
    @GetMapping("/")
    public String endpoint() {
        return "Hello Human";
    }
}

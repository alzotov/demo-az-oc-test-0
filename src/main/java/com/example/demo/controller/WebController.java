package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @RequestMapping("/hello")
    public Map<String, String> getCommitId() {
        Map<String, String> result = new HashMap<>();
        result.put("msg","Hello, World");
        return result;
    }
}

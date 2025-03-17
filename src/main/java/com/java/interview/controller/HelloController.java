package com.java.interview.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class HelloController {
    
    @GetMapping("hello/{name}")
    public String greetings(@PathVariable String name) {
        return "How are you, " + name;
    }
    
}

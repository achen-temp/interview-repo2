package com.java.interview.controller;

import org.springframework.web.bind.annotation.RestController;

import com.java.interview.service.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class HelloController {

    @Autowired
    private HelloService service;
    
    @GetMapping("hello/{name}")
    public String greetings(@PathVariable String name) {
        return "How are you, " + name;
    }
    
}

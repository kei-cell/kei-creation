package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;


public class HelloController {
    @GetMapping
    public String getHello() {
        return "hello";
    }
}

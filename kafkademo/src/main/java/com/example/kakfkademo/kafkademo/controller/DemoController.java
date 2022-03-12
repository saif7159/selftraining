package com.example.kakfkademo.kafkademo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DemoController {
    @GetMapping(path = "ping")
    public String ping() {
        log.info("I am working");
        return "I am working";
    }
}

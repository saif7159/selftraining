package com.example.kakfkademo.kafkademo.controller;

import com.example.kakfkademo.kafkademo.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping(path = "ping")
    public String ping() {
        log.info("" + Thread.currentThread().getId());
        log.info("I am working");
        demoService.test();
        log.info("I should trigger second");
        return "i love you babba";
    }

}

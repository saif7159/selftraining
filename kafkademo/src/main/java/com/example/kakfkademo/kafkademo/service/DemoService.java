package com.example.kakfkademo.kafkademo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DemoService {
    @Async
    public void test() {
        try {
            Thread.sleep(10000);
            log.info("" + Thread.currentThread().getId());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        log.info("I would trigger first");
    }

}

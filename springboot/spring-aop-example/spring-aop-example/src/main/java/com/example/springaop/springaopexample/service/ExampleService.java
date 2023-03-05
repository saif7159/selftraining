package com.example.springaop.springaopexample.service;

import org.springframework.stereotype.Component;

@Component
public class ExampleService {
    public int exampleMethod(){
        return 5*5;
    }
}
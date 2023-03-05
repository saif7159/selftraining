package com.prototype.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PrototypeController {
    @GetMapping("/ping")
    public ResponseEntity<?> ping() {
        return new ResponseEntity<>("Prototype service is working", HttpStatus.OK);
    }
}

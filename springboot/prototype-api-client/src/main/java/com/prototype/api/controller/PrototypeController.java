package com.prototype.api.controller;

import com.prototype.api.config.PrototypeConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client/api")
public class PrototypeController {
    @Autowired
    PrototypeConfiguration prototypeConfiguration;
    @GetMapping("/ping")
    public ResponseEntity<?> ping() {
        return new ResponseEntity<>("Prototype service is working" + prototypeConfiguration.getName(), HttpStatus.OK);
    }
}

package com.demo.kafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class KafkaDemoController {

    private final KafkaTemplate<String, String> kafkaTemplate;
    @Value("${kafka-config.topic}")
    private String topic;

    @Autowired
    public KafkaDemoController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping("push-message/{msg}")
    public ResponseEntity<String> publishToKafkaTopic(@PathVariable String msg) {
        kafkaTemplate.send(topic, msg);
        return new ResponseEntity<>(msg.concat(" Published Successfully."), HttpStatus.OK);
    }
}

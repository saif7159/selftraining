package com.prototype.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PrototypeApiSvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrototypeApiSvcApplication.class, args);
    }

}

package com.selfpractice.gateway.gatewayzuulsvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class GatewayZuulSvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulSvcApplication.class, args);
    }

}

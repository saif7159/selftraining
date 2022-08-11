package com.example.kakfkademo.kafkademo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class KafkademoApplication {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("abc", 2);
		System.out.println(map.get("abc"));
		SpringApplication.run(KafkademoApplication.class, args);
	}

}

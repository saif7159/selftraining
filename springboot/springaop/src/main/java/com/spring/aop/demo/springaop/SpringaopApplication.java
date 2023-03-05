package com.spring.aop.demo.springaop;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.spring.aop.demo.springaop.model.Person;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringaopApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringaopApplication.class, args);
	}

    public static List<Person> getPeople() throws IOException {
        File json = new File("src/main/resources/people.json");
        InputStream inputStream = new FileInputStream(json);
        String read = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
        return new ObjectMapper().readValue(read, new TypeReference<List<Person>>() {
        });
    }

}

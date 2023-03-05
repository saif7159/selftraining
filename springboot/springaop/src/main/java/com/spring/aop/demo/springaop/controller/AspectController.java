package com.spring.aop.demo.springaop.controller;

import com.spring.aop.demo.springaop.SpringaopApplication;
import com.spring.aop.demo.springaop.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AspectController {
    @GetMapping("age/{player}")
    public int getAge(@PathVariable String player){
        int age = 0;
        try {
            List<Person> people = SpringaopApplication.getPeople();
            age = people.stream().filter(person -> person.getFirstName().equals(player)).mapToInt(Person::getAge).distinct().findAny().orElse(-1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return age;
    }
}

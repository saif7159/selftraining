package com.spring.aop.demo.springaop.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Person {

    private  Integer id;
    private  String firstName;
    private  String lastName;
    private  String email;
    private  String gender;
    private  Integer age;

}
package com.practice.interview.springpracticesvc.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book implements Serializable {
    public static final Long serialVersionUID = 42L;
    private Long isbn;
    private String bookName;
    private Integer price;
}

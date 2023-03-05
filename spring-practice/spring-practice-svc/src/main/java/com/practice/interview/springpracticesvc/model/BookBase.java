package com.practice.interview.springpracticesvc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BookBase {
    BROTHER_KARAMAZOV(123423L, 5),
    CRIME_PUNISHMENT(4234325L, 66);

    private Long isbn;
    private Integer price;
}

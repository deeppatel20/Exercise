package com.google.collectionexercise.hashmapsortbyvalue.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Employee {

    int id;
    String name;
    int salary;
}

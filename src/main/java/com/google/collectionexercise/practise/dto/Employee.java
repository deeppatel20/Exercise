package com.google.collectionexercise.practise.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@ToString
@Builder
public class Employee {
    private int id;
    private String name;
    private LocalDate dob;
    private double salary;
    private String designation;




}

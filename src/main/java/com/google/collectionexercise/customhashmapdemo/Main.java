package com.google.collectionexercise.customhashmapdemo;

import com.google.collectionexercise.customhashmapdemo.service.EmployeeService;
import com.google.collectionexercise.customhashmapdemo.service.EmployeeServiceImpl;

public class Main {
    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeServiceImpl();

        employeeService.sortByEmployeeKey();

    }
}

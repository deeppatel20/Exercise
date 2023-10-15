package com.google.collectionexercise.practise;

import com.google.collectionexercise.practise.service.EmployeeService;
import com.google.collectionexercise.practise.service.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeServiceImpl();


        employeeService.sortByDob();

        log.debug(String.valueOf(employeeService.findSecondHighestSalary()));

        log.debug(String.valueOf(employeeService.findDuplicate()));

        log.debug(String.valueOf(employeeService.countEmployeeBasedOnDesignation("Tester")));

        log.debug(String.valueOf(employeeService.searchEmployeeBasedOnDesignation("Tester")));


    }
}

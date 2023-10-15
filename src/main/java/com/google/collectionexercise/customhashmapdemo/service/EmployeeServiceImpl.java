package com.google.collectionexercise.customhashmapdemo.service;

import com.google.collectionexercise.customhashmapdemo.dto.Employee;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {


    public Map<Employee, Integer> employeeIntegerMap = new HashMap<>();

    @Override
    public void addEmployeeHashMap() {
        employeeIntegerMap
                .put(new Employee(1, "Deep", LocalDate.of(2002, 02, 02), 12000, "Devops"), 1);
        employeeIntegerMap
                .put(new Employee(3, "Darshan", LocalDate.of(2002, 02, 02), 70000, "Java"), 3);
        employeeIntegerMap
                .put(new Employee(5, "Hiren", LocalDate.of(2002, 02, 02), 80000, "Tester"), 5);
        employeeIntegerMap
                .put(new Employee(4, "Raj", LocalDate.of(2002, 02, 02), 90000, "Tester"), 4);
        employeeIntegerMap
                .put(new Employee(2, "Smit", LocalDate.of(2002, 02, 02), 75000, "Tester"), 2);
    }

    @Override
    public void sortByEmployeeKey() {
        addEmployeeHashMap();
        employeeIntegerMap
                .keySet().stream()
                .sorted((o1, o2) -> Integer.valueOf(o1.getId()).compareTo(Integer.valueOf(o2.getId())))
                .forEach(System.out::println);

    }
}

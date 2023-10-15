package com.google.collectionexercise.practise.service;

import com.google.collectionexercise.practise.dto.Employee;


import java.util.List;

public interface EmployeeService {
    public void addEmployee();


    public List<Employee> findDuplicate();
    public int countEmployeeBasedOnDesignation(String designation);
    public List<Employee> searchEmployeeBasedOnDesignation(String designation);
    public void sortByDob();
    public Employee findSecondHighestSalary();


}

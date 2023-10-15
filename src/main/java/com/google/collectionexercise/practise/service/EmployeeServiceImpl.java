package com.google.collectionexercise.practise.service;

import com.google.collectionexercise.practise.dto.Employee;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    private List<Employee> employeeList;

    public EmployeeServiceImpl() {
        employeeList = new ArrayList<>();
        addEmployee();
    }

    private static Employee getBuild(int id, String name, LocalDate dob, String designation, Double salary) {
        return Employee.builder()
                .designation(designation)
                .dob(dob)
                .id(id)
                .name(name)
                .salary(salary)
                .build();
    }

    @Override
    public void addEmployee() {
        employeeList
                .add(getBuild(1
                        , "Deep"
                        , LocalDate.of(2000, 01, 01)
                        , "Devops"
                        , 120000.0));
        employeeList
                .add(getBuild(2
                        , "Hiren"
                        , LocalDate.of(2002, 06, 05)
                        , "java"
                        , 80000.0));
        employeeList
                .add(getBuild(3
                        , "Raj"
                        , LocalDate.of(2004, 11, 10)
                        , "Tester"
                        , 90000.0));
        employeeList
                .add(getBuild(2
                        , "Darshan"
                        , LocalDate.of(2004, 11, 10)
                        , "Tester"
                        , 70000.0));
        employeeList
                .add(getBuild(1
                        , "smit"
                        , LocalDate.of(2004, 11, 10)
                        , "Tester"
                        , 60000.0));
    }

    @Override
    public List<Employee> findDuplicate() {
        List<Employee> duplicateEmployeeList = new ArrayList<>();
        int i = 0;

        employeeList.sort((o1, o2) -> Integer.compare(o1.getId(), o2.getId()));
        for (i = 0; i < employeeList.size() - 1; i++) {
            if (employeeList.get(i).getId() == employeeList.get(i + 1).getId()) {
                duplicateEmployeeList.add(employeeList.get(i));
                duplicateEmployeeList.add(employeeList.get(i + 1));
            }
        }
        return duplicateEmployeeList;
    }

    @Override
    public int countEmployeeBasedOnDesignation(String designation) {

        return (int) employeeList
                .stream()
                .filter(employee -> Objects.equals(employee.getDesignation(), designation)).count();
    }

    @Override
    public List<Employee> searchEmployeeBasedOnDesignation(String designation) {

        return employeeList
                .stream()
                .filter(employee -> Objects.equals(employee.getDesignation(), designation)).toList();
    }

    @Override
    public void sortByDob() {

        employeeList.sort((o1, o2) -> o1.getDob().compareTo(o2.getDob()));

        employeeList.forEach(employee -> log.debug(String.valueOf(employee)));

    }

    @Override
    public Employee findSecondHighestSalary() {

        employeeList.sort((o1, o2) -> -Double.compare(o1.getSalary(), o2.getSalary()));
        return employeeList.get(1);
    }


}

package com.google.collectionexercise.customhashmapdemo.dto;

import lombok.*;

import java.time.LocalDate;


@Getter
@ToString
@RequiredArgsConstructor
public final class Employee {
    private final int id;
    @NonNull
    private final String name;
    private final LocalDate dob;
    @NonNull
    private final int salary;
    @NonNull
    private final String designation;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (salary != employee.salary) return false;
        if (!name.equals(employee.name)) return false;
        if (!dob.equals(employee.dob)) return false;
        return designation.equals(employee.designation);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + dob.hashCode();
        result = 31 * result + salary;
        result = 31 * result + designation.hashCode();
        return result;
    }
}

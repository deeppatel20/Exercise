package com.google.cloning.deepcloning;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee implements Cloneable {

    Long id;

    String name;

    Address address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

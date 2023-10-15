package com.google.cloning.deepcloning;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Address address = new Address();
        address.setCity("Ottawa");
        Employee e1 = new Employee();

        e1.setId(1L);
        e1.setName("Deep");
        e1.setAddress(address);


        Employee e2 = (Employee) e1.clone();
        e2.address= (Address) e1.address.clone();


        log.info(String.valueOf(e1.hashCode()));
        log.info(String.valueOf(e2.hashCode()));

        log.info(String.valueOf(e1.address.hashCode()));
        log.info(String.valueOf(e2.address.hashCode()));

    }
}

package com.google.collectionexercise.hashmapsortbyvalue.service;



import com.google.collectionexercise.hashmapsortbyvalue.dto.Employee;

import java.util.*;

public class Demo {

    HashMap<Integer, Employee> map;


    public Demo() {

        map=new HashMap<>();
        map.put(1,new Employee(1,"Rahul",100000));
        map.put(2,new Employee(2,"Sachin",80000));
        map.put(3,new Employee(3,"viru",120000));
        map.put(4,new Employee(4,"virat",70000));

    }

    public HashMap<Integer, Employee> sortByValue() {
        List<Map.Entry<Integer, Employee>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> Integer.compare(o1.getValue().getSalary(),o2.getValue().getSalary()));
        HashMap<Integer,Employee> hashMap =new LinkedHashMap<>();
        for (Map.Entry<Integer, Employee> entry : list) {
            hashMap.put(entry.getKey(),entry.getValue());
        }

        return hashMap;
    }


}

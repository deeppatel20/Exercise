package com.google.immutableclass.immutableclass1;

import com.google.immutableclass.immutableclass1.ImmutableClass;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "First");
        hashMap.put("2", "Second");


        String s = "origional";
        int i=10;

        ImmutableClass immutableClass = new ImmutableClass(i, s, hashMap);

        System.out.println(immutableClass.getId());
        System.out.println(immutableClass.getName());
        System.out.println(immutableClass.getTestMap());

        System.out.println("========== after local variables changed ==========");

        s = "modified";
        i=20;
        hashMap.put("3", "Third");
        System.out.println(immutableClass.getId());
        System.out.println(immutableClass.getName());
        System.out.println(immutableClass.getTestMap());

        System.out.println("========== Don't forget write clone otherwise, hashmap values changed ==========");

        HashMap<String, String> hashMapTest = immutableClass.getTestMap();
        hashMapTest.put("4", "New");
        System.out.println(immutableClass.getTestMap());

    }
}

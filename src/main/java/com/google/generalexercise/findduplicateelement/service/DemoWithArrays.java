package com.google.generalexercise.findduplicateelement.service;

public class DemoWithArrays {
    public void findDuplicate(String s) {

        int[] ints = new int[256];

        for (int i = 0; i < s.length(); i++) {
            ints[s.charAt(i)]=ints[s.charAt(i)]+1;
        }
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > 1) {
                System.out.println("char = "+(char)i+", Repeating for "+ints[i] +" times");

            }
        }

    }
}

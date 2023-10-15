package com.google.generalexercise.stringconcept;

public class Main {
    public static void main(String[] args) {
        String s = "deep"; //creates one object in string pool
        s= null; //it will point out to null value

        System.out.println(s);

    }
}

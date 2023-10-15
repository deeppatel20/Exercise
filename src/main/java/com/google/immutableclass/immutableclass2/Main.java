package com.google.immutableclass.immutableclass2;



public class Main {

    public static void main(String[] args) {

        int i =5;
        StringBuffer sb = new StringBuffer("Deep");
        ImmutableClass immutableClass = new ImmutableClass(i,sb);

        System.out.println(immutableClass.getId());
        System.out.println(immutableClass.getStringBuffer());

        sb.append("Hello");


        System.out.println(immutableClass.getId());
        System.out.println(immutableClass.getStringBuffer());

    }



}

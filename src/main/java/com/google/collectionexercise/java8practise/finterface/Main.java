package com.google.collectionexercise.java8practise.finterface;

public class Main {
    public static void main(String[] args) {
        Finterface total = (a, b) -> a*b;
        System.out.println(total.multiply(6,7));
    }
}

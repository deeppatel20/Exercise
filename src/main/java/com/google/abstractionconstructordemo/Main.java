package com.google.abstractionconstructordemo;

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo(5) {};
        System.out.println(demo.a);
        System.out.println(demo.calculate(5));
        //interface example
        Demo2 demo2 = new Demo2() {};
        System.out.println(demo2.add(5));
        System.out.println(Demo2.substract(4));




    }
}

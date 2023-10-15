package com.google.abstractionconstructordemo;

public abstract class Demo {
    int a;

    public Demo(int a) {
        this.a = a;
    }

    public int calculate(int b){
        return b*b;
    }
}

package com.google.abstractionconstructordemo;

public interface Demo2 {
    static int substract(int b) {
        return b + b;
    }

    private int calculate(int b) {
        return b * b;
    }

    default int add(int b) {
        int c = calculate(b);
        return c + c;
    }
}

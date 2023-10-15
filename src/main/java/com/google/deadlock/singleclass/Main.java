package com.google.deadlock.singleclass;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new DeadlockClass());
        Thread thread2 = new Thread(new DeadlockClass());

        thread1.start();
        thread2.start();
    }
}

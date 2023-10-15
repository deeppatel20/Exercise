package com.google.deadlock.doubleclass;

public class Producer implements Runnable {
    @Override
    public void run() {
        synchronized (Integer.class) {
            System.out.println("In Interger class");
            synchronized (String.class) {
                System.out.println("In String class");
            }
        }
    }
}

package com.google.deadlock.singleclass;

public class DeadlockClass implements Runnable {
    @Override
    public void run() {
        synchronized (Integer.class) {
            System.out.println("In Interger class");
            synchronized (String.class) {
                System.out.println("In String class");
            }
        }
        synchronized (String.class) {
            System.out.println("In second String class");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (Integer.class) {
                System.out.println("In second Integer class");
            }
        }
    }
}

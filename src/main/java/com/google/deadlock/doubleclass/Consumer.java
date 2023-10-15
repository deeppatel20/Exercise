package com.google.deadlock.doubleclass;

public class Consumer implements Runnable {
    @Override
    public void run() {
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

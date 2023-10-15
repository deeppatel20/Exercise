package com.google.synchronizationpsuedocode.service;

public class Table {
    public static synchronized void print(int n){

            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(n * i);
            }

    }
}

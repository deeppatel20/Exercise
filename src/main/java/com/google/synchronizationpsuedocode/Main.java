package com.google.synchronizationpsuedocode;

import com.google.synchronizationpsuedocode.service.Table;

public class Main {
    public static void main(String[] args) {
        Table table = new Table();
        Table table1 = new Table();
        Thread thread1 = new Thread(() -> table.print(5));
        Thread thread2 = new Thread(() -> table1.print(100));
        thread1.start();
        thread2.start();
    }
}

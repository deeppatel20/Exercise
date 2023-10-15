package com.google.objectpool.service;

import java.util.concurrent.atomic.AtomicInteger;

public class Oliphaunt {
    private static final AtomicInteger counter = new AtomicInteger(0);
    private final int id;

    public Oliphaunt() {
        this.id = counter.incrementAndGet();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(toString());
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Oliphaunt id=%d", id);
    }
}

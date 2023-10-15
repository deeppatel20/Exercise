package com.google.objectpool.service;

import java.util.HashSet;
import java.util.Set;

public abstract class ObjectPool<T> {

    private final Set<T> available = new HashSet<>();
    private final Set<T> inUse = new HashSet<>();

    protected  abstract T create();

    public synchronized T checkout(){

        if (available.isEmpty()) {
            available.add((create()));
        }
        T instance = available.iterator().next();
        available.remove(instance);
        inUse.add(instance);
        System.out.println("After checkout => "+toString());
        return instance;
    }

    public synchronized void checkIn(T instance) {
        inUse.remove(instance);
        available.add(instance);
        System.out.println("After checkin => "+toString());
    }

    @Override
    public String toString() {
        return String.format("Pool available=%d, inuse=%d", available.size(), inUse.size());
    }

}

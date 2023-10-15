package com.google.collectionexercise.failsafeandfailfastdemo;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Slf4j
public class FailSafeDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> integers = new CopyOnWriteArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        Iterator<Integer> iterator = integers.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            integers.add(4);
        }

        System.out.println(integers);
    }

}

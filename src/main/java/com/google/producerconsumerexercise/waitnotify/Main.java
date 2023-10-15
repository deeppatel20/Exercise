package com.google.producerconsumerexercise.waitnotify;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.Queue;
@Slf4j
public class Main {
    public static void main(String[] args) {
        final Queue<Integer> queue = new LinkedList<>();
        int maxSize =1;

        Thread producerThread = new Thread(() ->
        {
            while (true) {
                synchronized (queue) {
                    if (queue.size() == maxSize) {
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    int item = (int) (Math.random()*100);
                    log.info("Produced item {}", item);
                    queue.add(item);
                    queue.notifyAll();
                }
            }
        },"Producer");


        Thread consumerThread = new Thread(() ->
        {
            while (true) {
                synchronized (queue) {
                    if (queue.isEmpty()) {
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    int item = queue.remove();
                    log.info("Consumed item {}", item);
                    queue.notifyAll();
                }
            }
        },"Consumer");

        producerThread.start();
        consumerThread.start();
    }
}

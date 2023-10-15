package com.google.producerconsumerexercise.synchronousqueue;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.SynchronousQueue;

@Slf4j
public class Main {
    public static void main(String[] args) {

        final SynchronousQueue<Integer> synchronousQueue = new SynchronousQueue<>();

        Thread producerThread = new Thread(() -> {
            while (true) {
                try {
                    int i = (int) (Math.random()*100);
                    log.info("Produced {}", i);
                    synchronousQueue.put(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Producer");


        Thread consumerThread = new Thread(() -> {
            while (true) {
                try {
                    int i = synchronousQueue.take();
                    log.info("Consumed {}",i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Consumer");

        producerThread.start();
        consumerThread.start();


    }
}

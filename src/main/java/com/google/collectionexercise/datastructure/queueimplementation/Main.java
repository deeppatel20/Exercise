package com.google.collectionexercise.datastructure.queueimplementation;

import com.google.collectionexercise.datastructure.queueimplementation.service.QueueImpl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        QueueImpl queue = new QueueImpl();
        System.out.println(queue.isEmpty());
        queue.enqueue("hello");
        queue.enqueue("java");

        System.out.println(queue.isEmpty());
        System.out.println(queue.deque());
        System.out.println(queue.deque());



        queue.enqueue("Deep");

        System.out.println(queue.deque());
        System.out.println(queue.isEmpty());
        System.out.println(queue.deque());


    }
}

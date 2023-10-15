package com.google.collectionexercise.datastructure.stackimpl.stackimplementation;

import com.google.collectionexercise.datastructure.stackimpl.stackimplementation.service.StackImpl;

public class Main {
    public static void main(String[] args) {

        StackImpl stack = new StackImpl();
        System.out.println(stack.isEmpty());

        stack.push("Hello");
        stack.push("java");

        System.out.println(stack.isEmpty());

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push("Deep");
        System.out.println(stack.pop());


        System.out.println(stack.isEmpty());



    }
}

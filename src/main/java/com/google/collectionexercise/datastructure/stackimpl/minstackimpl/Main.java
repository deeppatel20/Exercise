package com.google.collectionexercise.datastructure.stackimpl.minstackimpl;

import com.google.collectionexercise.datastructure.stackimpl.minstackimpl.service.MinStack;

public class Main {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(1000);
        minStack.push(1);
        minStack.push(2000);

        System.out.println(minStack.getMin());
    }
}

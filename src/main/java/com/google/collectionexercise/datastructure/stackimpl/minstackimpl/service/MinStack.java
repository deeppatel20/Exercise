package com.google.collectionexercise.datastructure.stackimpl.minstackimpl.service;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.empty() || x <= minStack.peek()) {
            minStack.push(x);
        }

    }

    public void pop() {
        if (stack.empty()) {
            return;
        }
        int x =stack.pop();
        if (x == minStack.peek()) {
            minStack.pop();
        }
    }

    public int getMin(){
        if (minStack.empty()) {
            return 0;
        }
        return minStack.peek();
    }
}

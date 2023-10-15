package com.google.collectionexercise.datastructure.stackimpl.stackimplementation.service;

public class StackImpl {

    public Node top;

    public boolean isEmpty() {
        if (top == null) {
            return true;
        }
        return false;
    }

    public void push(String str) {

        Node previous = top;
        top = new Node(str, previous);
    }

    public String pop() {
        if (top==null) {
            return null;
        }
        String str = top.item;
        top = top.previous;
        return str;
    }

    class Node {
        String item;
        Node previous;

        public Node(String item, Node previous) {
            this.item = item;
            this.previous = previous;
        }
    }

}

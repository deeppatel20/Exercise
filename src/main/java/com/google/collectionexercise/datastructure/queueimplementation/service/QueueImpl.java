package com.google.collectionexercise.datastructure.queueimplementation.service;

public class QueueImpl {
    public Node head;
    public Node tail;

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void enqueue(String str) {
        Node newNode = new Node(str);
        if (head == null) {
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=tail.next;
        }
    }

    public String deque() {
        if (head==null) {
            return null;
        } else {
            String str = head.item;
            head=head.next;
            return str;
        }
    }
    class Node {
        String item;
        Node next;

        public Node(String item) {
            this.item = item;
            this.next = null;
        }
    }
}

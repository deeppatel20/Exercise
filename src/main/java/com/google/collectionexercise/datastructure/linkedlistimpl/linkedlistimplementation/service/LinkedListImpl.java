package com.google.collectionexercise.datastructure.linkedlistimpl.linkedlistimplementation.service;

public class LinkedListImpl {

    public Node head;
    public Node tail;

    public void findCycleInLinkedList() {
        Node slowPointer = head;
        Node fastPointer = head;

        while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;

            if (slowPointer == fastPointer) {
                System.out.println("We have a loop here "+slowPointer.data);
                break;
            }
        }
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
    }

    public void printNode() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ----> ");
            current = current.next;
        }
        System.out.println("null");

    }

    public void findMiddleNode() {
        Node fastPointer = head;
        Node slowPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        System.out.println(slowPointer.data);
    }


    public void remove(int value){
        if (head == null) {
            return;
        }
        if (head.data == value) {
            head=head.next;
            return;
        }
        Node previous = head;
        Node current =head.next;
        while (current != null) {
            if (current.data == value) {
                    previous.next= current.next;
            }
            previous =current;
            current= current.next;
        }


    }

    public Node reverseLinkedList(Node head){

        Node previous = head.next;
        Node next = head.next.next;
        head.next=null;

        while (previous != null) {
            previous.next=head;
            head=previous;
            previous=next;
            if (next != null) {
                next=next.next;
            }
        }
        return head;
    }



    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


}

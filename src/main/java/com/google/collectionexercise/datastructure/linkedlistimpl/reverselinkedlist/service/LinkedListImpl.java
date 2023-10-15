package com.google.collectionexercise.datastructure.linkedlistimpl.reverselinkedlist.service;

public class LinkedListImpl {

    public static Node head;


    public void printNode() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ----> ");
            current = current.next;
        }
        System.out.println("null");

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

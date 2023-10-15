package com.google.collectionexercise.datastructure.linkedlistimpl.linkedlistimplementation;

import com.google.collectionexercise.datastructure.linkedlistimpl.linkedlistimplementation.service.LinkedListImpl;

public class Main {
    public static void main(String[] args) {

        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.addNode(5);
        linkedList.addNode(6);
        linkedList.remove(4);

       // linkedList.head.next.next.next=linkedList.head.next;

       // linkedList.findCycleInLinkedList();

        //linkedList.findMiddleNode();


        linkedList.printNode();
        linkedList.head= linkedList.reverseLinkedList(linkedList.head);
        linkedList.printNode();


    }
}

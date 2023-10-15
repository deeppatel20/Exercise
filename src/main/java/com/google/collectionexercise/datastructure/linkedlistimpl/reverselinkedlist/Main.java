package com.google.collectionexercise.datastructure.linkedlistimpl.reverselinkedlist;

import com.google.collectionexercise.datastructure.linkedlistimpl.reverselinkedlist.service.LinkedListImpl;

public class Main {
    public static void main(String[] args) {

        LinkedListImpl linkedList =new LinkedListImpl();
        LinkedListImpl.head = new LinkedListImpl.Node(1);
        LinkedListImpl.Node second = new LinkedListImpl.Node(2);
        LinkedListImpl.Node third = new LinkedListImpl.Node(3);
        LinkedListImpl.Node fourth = new LinkedListImpl.Node(4);
        LinkedListImpl.Node fifth = new LinkedListImpl.Node(5);

        linkedList.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        linkedList.printNode();
        LinkedListImpl.head= linkedList.reverseLinkedList(linkedList.head);
        linkedList.printNode();


    }
}

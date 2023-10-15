package com.google.collectionexercise.comparatordemo;

import lombok.extern.slf4j.Slf4j;

import java.util.TreeSet;


@Slf4j
public class Main {

    public static void main(String[] args) {

        SortByLengthAndOrder sort = new SortByLengthAndOrder();
        TreeSet<String> treeSet = new TreeSet<>(sort);
        treeSet.add("A");
        treeSet.add("AA");
        treeSet.add("AAA");
        treeSet.add("B");
        treeSet.add("BBB");
        treeSet.add("CCCC");

        log.info(String.valueOf(treeSet));


    }

}

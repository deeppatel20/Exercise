package com.google.collectionexercise.datastructure.binarysearch;

import com.google.collectionexercise.datastructure.binarysearch.service.BinarySearch;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{10, 20, 30, 40};
        BinarySearch binarySearch =new BinarySearch();

        System.out.println(binarySearch.binarySearch(array,40));
    }
}

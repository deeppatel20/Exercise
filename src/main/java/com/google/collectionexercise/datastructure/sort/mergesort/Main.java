package com.google.collectionexercise.datastructure.sort.mergesort;

import com.google.collectionexercise.datastructure.sort.mergesort.service.MergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] arr = new int[]{2,5,6,1,10,4,9};
        mergeSort.mergeSort(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }
}

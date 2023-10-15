package com.google.collectionexercise.datastructure.sort.quicksort;

import com.google.collectionexercise.datastructure.sort.quicksort.service.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = {5, 2, 9, 1, 5, 6};
        quickSort.quickSort(arr, 0, arr.length - 1);

        Arrays.stream(arr).forEach(System.out::println);
    }
}

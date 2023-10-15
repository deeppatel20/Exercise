package com.google.collectionexercise.datastructure.sort.selectionsort;

import com.google.collectionexercise.datastructure.sort.selectionsort.service.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SelectionSort selectionSort =new SelectionSort();
        int[] arr = { 64, 25, 12, 22, 11 };

        selectionSort.selectionSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }




}

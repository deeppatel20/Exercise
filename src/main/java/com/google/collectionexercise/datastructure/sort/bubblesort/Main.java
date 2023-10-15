package com.google.collectionexercise.datastructure.sort.bubblesort;

import com.google.collectionexercise.datastructure.sort.bubblesort.service.BubbleSort;

public class Main {
    public static void main(String[] args) {

        int[] a =new int[]{10,45,20,30,5};
        BubbleSort bubbleSort =new BubbleSort();
        bubbleSort.sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+", ");
        }


    }
}

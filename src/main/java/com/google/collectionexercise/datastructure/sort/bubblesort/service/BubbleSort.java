package com.google.collectionexercise.datastructure.sort.bubblesort.service;

public class BubbleSort {

    public void sort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int flag=0;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag=1;
                }
            }
            if (flag==0) {
                break;
            }
        }
    }
}

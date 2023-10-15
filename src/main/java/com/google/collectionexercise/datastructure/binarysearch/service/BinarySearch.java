package com.google.collectionexercise.datastructure.binarysearch.service;

public class BinarySearch {
    public static int binarySearch(int[] arr, int x) {
        /*
         * Searches for the value x in the given array using binary search algorithm.
         * Returns the index of x if found, otherwise returns -1.
         */
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}

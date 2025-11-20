package org.example.sample;

import java.util.Arrays;

public class SearchComparison {

    // Linear Search
    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    // Binary Search (Iterative)
    static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 100000;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        int key = n;

        // Measure Linear Search Time
        long startLinear = System.nanoTime();
        int resultLinear = linearSearch(arr, key);
        long endLinear = System.nanoTime();

        long linearTime = endLinear - startLinear;

        // Measure Binary Search Time
        long startBinary = System.nanoTime();
        int resultBinary = binarySearch(arr, key);
        long endBinary = System.nanoTime();

        long binaryTime = endBinary - startBinary;

        // Results
        System.out.println("===== Search Comparison =====");
        System.out.println("Array Size: " + n);
        System.out.println("Search Key: " + key);
        System.out.println();

        System.out.println("Linear Search Result: " + (resultLinear != -1 ? "Found at index " + resultLinear : "Not found"));
        System.out.println("Linear Search Time: " + linearTime + " ns");
        System.out.println();

        System.out.println("Binary Search Result: " + (resultBinary != -1 ? "Found at index " + resultBinary : "Not found"));
        System.out.println("Binary Search Time: " + binaryTime + " ns");
    }
}


package org.example.sample;

public class BubbleSortExample {

    // Bubble Sort Algorithm
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int n = 5000;
        int[] arr = new int[n];

        // random values
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * n);
        }

        Runtime runtime = Runtime.getRuntime();

        // Measure memory before sorting
        runtime.gc();
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();

        // Measure time before sorting
        long startTime = System.nanoTime();

        // Perform Bubble Sort
        bubbleSort(arr);

        // Measure time after sorting
        long endTime = System.nanoTime();

        // Measure memory after sorting
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();

        // Calculate results
        long timeTaken = endTime - startTime;
        long memoryUsed = memoryAfter - memoryBefore;

        System.out.println("===== Bubble Sort Performance =====");
        System.out.println("Array Size: " + n);
        System.out.println("Execution Time: " + timeTaken + " ns");
        System.out.println("Memory Used: " + memoryUsed + " bytes");
    }
}


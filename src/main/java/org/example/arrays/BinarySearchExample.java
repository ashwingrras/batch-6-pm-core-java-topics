package org.example.arrays;

public class BinarySearchExample {
    // Binary search method
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int loopCount = 1;
        while (left <= right) {
            System.out.println("count "+loopCount);
            loopCount++;
            //int mid = left + (right - left) / 2; // avoids overflow
            int mid = (left + right) / 2; // avoids overflow

            System.out.println("left "+left+", right "+right);
            System.out.println("mid "+mid);
            System.out.println("arr[mid] "+arr[mid]);
            if (arr[mid] == target) {
                return mid; // target found
            } else if (arr[mid] < target) {
                left = mid + 1; // search right half
            } else {
                right = mid - 1; // search left half
            }
        }
        return -1; // target not found
    }

    // Main method to test
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; //{2, 4, 6, 8, 10, 12, 14};
        int target = 5;
        System.out.println("target "+target);
        int result = binarySearch(numbers, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}


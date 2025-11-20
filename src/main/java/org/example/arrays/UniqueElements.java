package org.example.arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[] input = {2, 1, 1, 3, 1, 4, 4, 5};
        int n = input.length;

        // Temporary array to store unique elements
        int[] unique = new int[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if input[i] is already in unique array
            for (int j = 0; j < uniqueCount; j++) {
                if (input[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not duplicate, add to unique array
            if (!isDuplicate) {
                unique[uniqueCount] = input[i];
                uniqueCount++;
            }
        }

        // Print the unique elements
        System.out.print("Unique elements: [");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i]);
            if (i < uniqueCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}


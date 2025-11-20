package org.example.arrays;

import java.util.Arrays;

public class ArrayExample5
{
    public static void main(String[] args)
    {
        // question 11
        //  2 1 1 3 1 4 4 5    : 2, 1, 3, 4, 5
        int[] array1 = {2, 1, 1, 3, 4, 4, 5};
        int[] arrayUnique = new int[array1.length];
        int uniqueValueCount = 0;
        System.out.println("array 1 "+ Arrays.toString(array1));
        for(int i =0; i < array1.length; i++)
        {
            int value = array1[i];
            boolean isValueFound = false;
            for(int j = 0; j < arrayUnique.length; j++)
            {
                if(value == arrayUnique[j])
                {
                    isValueFound = true;
                    break;
                }
            }
            if(!isValueFound)
            {
                arrayUnique[i] = value;
                uniqueValueCount++;
            }
        }
        System.out.println("arrayUnique "+ Arrays.toString(arrayUnique));
        System.out.println("uniqueValueCount "+uniqueValueCount);
        int[] arrayNonDuplicate = new int[uniqueValueCount];
        int indexUnique = 0;
        for(int i=0; i < arrayUnique.length;i++)
        {
            if(arrayUnique[i] != 0)
            {
                arrayNonDuplicate[indexUnique] = arrayUnique[i];
                indexUnique++;
            }
        }
        System.out.println("arrayNonDuplicate "+Arrays.toString(arrayNonDuplicate));
        // question 12
        //  2 1 1 3 4 4 5: [ 1, 2, 1, 2, 1, 0, 0 ]
        int[] array2 = {2, 1, 1, 3, 4, 4, 5};
        int[] arrayWithCount = new int[array2.length];
        // question 13
        // 3 * 2 * 1 = 6 - 2 : 4
        // 2 * 1 * 4 = 8 - 1 : 7
        //  3 2 1 4 5 : 4, 7, 16, 55, 27

        int[] arr1 = {3, 2, 1, 4, 5};
        System.out.println("Before Update:");
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++)
        {
            // i 0 .. 4 : <=  5 -3 : 2
            // i = 0, 1, 2
            if (i <= arr1.length - 3) {
                arr2[i] = (arr1[i] * arr1[i + 1] * arr1[i + 2]) - arr1[i + 1];
                // i == 3
            } else if (i == arr1.length - 2) {
                arr2[i] = (arr1[i] * arr1[i + 1] * arr1[0]) - arr1[i + 1];
                // i == 4
            } else
                arr2[i] = (arr1[i] * arr1[0] * arr1[1]) - arr1[0];
        }
        System.out.println("After Update:");
        System.out.print(Arrays.toString(arr2));

        System.out.println();

    }
}

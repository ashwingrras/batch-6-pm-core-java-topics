package org.example.sorting;

import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args) {
        // [2, 3, 1, 5, 4]
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(" before "+ Arrays.toString(array));
        for(int i=0; i < array.length - 1; i++)
        {
            // 0 .. 4, 0
            for(int j = 0; j < array.length - i - 1; j++)
            {
                //System.out.println("array[j] : "+array[j] +", array[j+1] : "+array[j+1]);
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    System.out.println(" inside: "+ Arrays.toString(array));
                }

            }
            System.out.println(" Phase  : "+(i+1)+" : "+ Arrays.toString(array));
        }
    }
}

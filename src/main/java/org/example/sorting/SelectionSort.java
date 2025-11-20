package org.example.sorting;

import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args) {

        int[] array = {29,72,98,13,87,66,52,36};
        for(int i=0; i < array.length - 1; i++)
        {
            int minimumValueIndex = i; // 13, 29
            for(int j= i +1; j < array.length; j++)
            {
                if(array[j] < array[minimumValueIndex])
                {
                    minimumValueIndex = j;
                }
            }
            int temp = array[minimumValueIndex];
            array[minimumValueIndex] = array[i];
            array[i] = temp;
            System.out.println("step "+(i+1)+" : "+Arrays.toString(array));
        }
    }
}

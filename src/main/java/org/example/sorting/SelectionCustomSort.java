package org.example.sorting;

import java.util.Arrays;

public class SelectionCustomSort
{
    public static void main(String[] args) {

        int[] array = {98,72,29,13,87,66,52,36};
        for(int i=0; i < 1; i++)
        {
            int minimumValueIndex = i; // 13, 29
            int maximumValueIndex = array.length - 1 - i;
            for(int j= i; j < array.length; j++)
            {
                if(array[j] < array[minimumValueIndex])
                {
                    minimumValueIndex = j;
                }
                if( array[j] > array[maximumValueIndex])
                {
                    maximumValueIndex = j;
                }
            }
            System.out.println("minimumValueIndex "+minimumValueIndex);
            System.out.println("maximumValueIndex "+maximumValueIndex);
        }
    }
}

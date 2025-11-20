package org.example.sorting;

import java.util.Arrays;

public class InsertionSort
{

    public static void main(String[] args)
    {
        int[] array = {85,12,59,45,72,51};
        //             {12,85,59,45,72,51};
        //             {12,59,85,45,72,51};
        for(int i = 1; i < array.length; i++)
        {
            int currentValue = array[i]; // 12, 59, 45
            int j =  i - 1; // 0, 1, 2
            while(j >= 0 && array[j] > currentValue) // 85 > 59
            {
                array[j+1] = array[j];
                //   85
                // 0, 1, 2, 3, 4, 5
                System.out.println("while "+Arrays.toString(array));
                // //          {12,85,85,45,72,51};
                //             {12,59,85,85,72,51};
                //             {12,59,59,85,72,51};
                j--; // -1, 0
            }
            array[j+1] = currentValue; // 12, 57
            //{12,59,85,45,72,51};
            //{12,45,59,85,72,51};
            System.out.println("for "+Arrays.toString(array));
        }
    }
}

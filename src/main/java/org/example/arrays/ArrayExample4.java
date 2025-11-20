package org.example.arrays;

import java.util.Arrays;

public class ArrayExample4
{
    public static void main(String[] args) {

        // question 6
        // 2 7 3 1 6 5:   5, -4, -2, 5, -1, -3

        // question 7
        //  2 1 1 3 4 4 5: [ 1, 2, 2, 1, 2, 2, 1 ]
        int[] array1 = {2 ,1 ,1 ,3 ,4 ,4 ,5};
        int[] array2 = new int[array1.length];
        System.out.println(" array 1 "+ Arrays.toString(array1));
        for(int i =0; i < array1.length; i++)
        {
            int count = 0;
            for(int j=0; j < array1.length; j++)
            {
                if(array1[i] == array1[j])
                {
                    count++;
                }
            }
            array2[i] = count;
        }
        System.out.println(" array 2 "+ Arrays.toString(array2));
        // question 8
        //  3 2 1 4 5 : 6, 8, 20, 60, 30

        // question 9
        //  3 2 1 4 5 : 3, 0, 3, 16, 10
        int[] array3 = {3 ,2 ,1 ,4 ,5};
        int[] array4 = new int[array3.length];
        System.out.println(" array 3 "+ Arrays.toString(array3));
        for(int i=0; i < array3.length;i++)
        {
            int currValue = array3[i];
            //int nextValue = i != array3.length - 1 ? array3[i+1] : array3[0];
            int nextValue = 0;
            if(i == array3.length - 1)
            {
                nextValue = array3[0];
            }
            else
            {
                nextValue = array3[i+1];
            }
            int value = (currValue * nextValue) - currValue;
            array4[i]= value;
        }
        System.out.println(" array 4 "+ Arrays.toString(array4));

        // question 10
        //  1 2 3 4 5 6: 4 5 6 1 2 3

        // question 11
        //  2 1 1 3 4 4 5: 2, 1, 3, 4, 5

        // question 12
        //  2 1 1 3 4 4 5: [ 1, 2, 1, 2, 1, 0, 0 ]

        // question 13
        // 3 * 2 * 1 = 6 - 2 : 4
        // 2 * 1 * 4 = 8 - 1 : 7
        //  3 2 1 4 5 : 4, 7, 16, 55, 27
    }
}

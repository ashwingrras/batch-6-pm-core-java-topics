package org.example.arrays;

import java.util.Arrays;

public class ArrayExample3
{
    public static void main(String[] args) {
        // question 3
        // reverse array 5 4 1 2 3


        int[] array = {3 ,2 ,1 ,4 ,5};
        // array[5]
        System.out.println(" question 1 ");
        for(int i = 4; i >= 0; i--)
        {
            System.out.println("i "+i);
        }

        for(int i = array.length - 1; i >= 0; i--)
        {
            System.out.println(array[i]);
        }

        int[] array2 = new int[5];
        // question 4 new array series
        // array series :  1 3 6 10 15
        // 1 3 6 10 15
        int value = 1;
        int counter = 2;
        System.out.println(" question 2 ");
        System.out.println("array2 before "+ Arrays.toString(array2));
        for(int i =0; i < array2.length; i++)
        {
            //System.out.println("value "+value);
            array2[i] = value; // 1, 3, 6, 10, 15
            value += counter; // 1 += 2 : 3, 3 += 3: 6, 6 += 4: 10, 10 += 5: 15
            // 15 += 6: 21
            counter++; // 3, 4, 5, 6
        }
        System.out.println("array2 after "+ Arrays.toString(array2));
        System.out.println(" question 3 ");
        int[] array3 = {3 ,2 ,1 ,4 ,5};
        System.out.println("array3 before "+ Arrays.toString(array3));
        // question 5
        //  3 2 1 4 5 : 6 2 4 20 15
        int array3Index0Value = array3[0];
        int[] array4 = new int[5];
        for(int i =0; i < array3.length; i++)
        {
            if(i != array3.length - 1) // 0 != 4, 1 != 4, 2 != 4 ,3 != 4, 4 != 4
            {
                array4[i] = array3[i] * array3[i+1];
            }
            else
            {
                array4[i] = array3[i] * array3[0];
            }
            // 1 : 3 * 2 : 6, i : 0 * 1
            // 2 : 2 * 1 : 2, i : 1 * 2
            // 3 : 1 * 4 : 4, i : 2 * 3
            // 4 : 4 * 5 : 20, i : 3 * 4
            // 5 : 5 * 3 : 15, i : 4 * 5 == length, 5 to 0, 4 * 0
        }
        System.out.println("array3 after "+ Arrays.toString(array3));
        System.out.println("array4 after "+ Arrays.toString(array4));

        // question 6
        // 2 7 3 1 6 5:   5, -4, -2, 5, -1, -3

        // question 7
        //  2 1 1 3 4 4 5: [ 1, 2, 2, 1, 2, 2, 1 ]

        // question 8
        //  3 2 1 4 5 : 6, 8, 20, 60, 30

        // question 9
        //  3 2 1 4 5 : 3, 0, 3, 16, 10

    }
}

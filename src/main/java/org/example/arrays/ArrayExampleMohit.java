package org.example.arrays;

import java.util.Arrays;

/*
    Time complexity : time take to compile
    Space complexity : memory taken

    Cases
    1. Best 0 (1)
    2. Average O ( n , n /2 )
    3. Worst 0 ( n )

        0 (1), O (n), O (log n)

    100

    0 ( 1 )
 */
public class ArrayExampleMohit
{
    public static void main(String[] args) {
        int[] array1 = {21, 24, 13, 16, 8};
        // 8, 16, 13, 24, 21
        // another question
        // { 8, 16, 13, 24, 21 }   1
        System.out.println("before "+ Arrays.toString(array1));
        for(int i =0; i < array1.length; i++)
        {
            int lastIndex = array1.length - 1 - i;
            if(i < lastIndex)
            {
                int temp = array1[i];
                array1[i] = array1[lastIndex];
                array1[lastIndex] = temp;
            }
            else
            {
                break;
            }
            System.out.println(" "+ Arrays.toString(array1));
        }
        System.out.println("after "+ Arrays.toString(array1));
    }
}

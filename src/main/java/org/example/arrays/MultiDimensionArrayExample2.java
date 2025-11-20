package org.example.arrays;

import java.util.Arrays;

public class MultiDimensionArrayExample2
{
    public static void main(String[] args)
    {
        System.out.println(" array example 1 ");
        int[][] arr1 = new int[4][4];
        int value = 1; // 0
        for(int i =0; i < arr1.length; i++)
        {
            for(int j = 0; j < arr1[i].length; j++)
            {
                // 0, 0, 0,1, 0, 2, 0, 3
                // 1, 0, 1,1, 1,2, 1,3
                arr1[i][j] = value;
                value++;
            }
            System.out.println(Arrays.toString(arr1[i]));
        }
        System.out.println(" array example 2 ");
        value = 1;
        int[][] arr2 = new int[4][];
        int columnLength = 0;
        for(int i =0; i < arr2.length; i++)
        {
            if(i % 2 == 0)
            {
                columnLength = 5;
            }
            else
            {
                columnLength = 3;
            }
            arr2[i] = new int[columnLength];
            for(int j=0; j < arr2[i].length; j++)
            {
                arr2[i][j] = value;
                value++;
            }
            System.out.println(Arrays.toString(arr2[i]));
        }
    }
}

package org.example.arrays;

import java.util.Arrays;

public class MultiDimensionArrayExample3
{
    public static void main(String[] args)
    {
        //////// First Question
        System.out.println(" first question ");
        int[][] array1 = new int[5][];
        int value = 1;
        for(int i =0; i < array1.length; i++)
        {
            array1[i] = new int[i+1];
            for(int j=0; j < array1[i].length; j++)
            {
                array1[i][j] = value;
            }
            value++;
            System.out.println(Arrays.toString(array1[i]));
        }
        //////// Second Question
        System.out.println(" second question ");
        int[][] array2 = new int[5][];
        int value1 = 5;
        for(int i =0; i < array2.length; i++)
        {
            array2[i] = new int[array2.length - i];
            for(int j=0; j < array2[i].length; j++)
            {
                array2[i][j] = value1;
            }
            value1--;
            System.out.println(Arrays.toString(array2[i]));
        }
        char a = 65;
        System.out.println(a);
        a = 74;
        System.out.println(a);
        // 65 to 74 : + 9
        // 10 to 1  : - 9
        // row: 4, col: row * 2
        System.out.println(" 3 D example ");
        int[][][] array3D = new int[4][0][0];
        for(int i =0; i < array3D.length; i++)
        {
            System.out.println(" i "+ i); // 0, 1
            array3D[i] = new  int[1][];
            for(int j=0; j < array3D[i].length; j++)
            {
                System.out.println(" j "+ j); // 0, 1, 0,
                array3D[i][j] = new int[2];
                for(int k =0; k < array3D[i][j].length; k++)
                {
                    System.out.print(" k "+ k); // 0, 1                // 0, 1
                }
                System.out.println();
            }
        }
    }
}

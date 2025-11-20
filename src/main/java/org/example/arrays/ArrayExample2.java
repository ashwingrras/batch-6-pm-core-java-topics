package org.example.arrays;

import java.util.Arrays;

public class ArrayExample2
{
    public static void main(String[] args)
    {
        int[] nos = new int[5];   // 5 is length/size, allow 5 values only
        int nosLength = nos.length;
        System.out.println("array length "+nosLength); // 5
        System.out.println(nos[0]); // value get
        //System.out.println(nos[1]);
        //System.out.println(nos[2]);

        nos[0] = 14; // here 14 value given to array on index 1
        nos[1] = 10; // idhar value array ko de rhe hai
        nos[2] = 13;
        nos[3] = 21;
        nos[4] = 16;

        /*
        nos[0] = nos[0] + 2;
        nos[1] = nos[1] + 2;
        nos[2] = nos[2] + 2;
        */
        // niche value array se le rhe hai
        int value1 = nos[0]; // here value get from array using index,
        int value2 = nos[1];
        //nos[3] = 51;
        System.out.println("value1 "+value1); // 21
        System.out.println(" print full array using for loop ");
        for(int i = 0; i < nos.length; i++)
        {
            System.out.println("index " +i +", value "+ nos[i]);
        }
        System.out.println(" print full array using while loop ");
        int i = 0;
        while(i < nos.length)
        {
            System.out.println("index " +i +", value "+ nos[i]);// 14, 10, 13, 21, 16
            i++;
        }
        // here array values update
        System.out.println("here array values update");
        for(int j=0; j < nosLength; j++)
        {
            System.out.println("index " +j +", value "+ nos[j]);// 14, 10, 13, 21, 16
            nos[j] = nos[j] + 2;
        }
        System.out.println(" last loop ");
        for(int j=0; j < nosLength; j++)
        {
            // 14, 10, 13, 21, 16
            System.out.println("index " +j +", value "+ nos[j]);// 16, 12, 15, 23, 18
        }

        System.out.println(" array with values not size ");
        //
        int[] rollNos = {101, 102, 103, 105, 106}; // [5]
        System.out.println(" rollNos array length "+rollNos.length);
        for(int j=0; j < rollNos.length; j++)
        {
            System.out.println("index " +j +", value "+ rollNos[j]);
        }

        String[] names = {"ashwin","ayush","mohit","krishna"};

        //
        // 3 2 1 4 5
        // question 1
        // 6 4 2 8 10
        // question 2
        // 9 4 1 16 25
        // int[] array1 = new int[5]
        // question 3
        // reverse array 5 4 1 2 3
        // question 4 new array series
        // array series :  1 3 6 10 15
        // question 5
        //  3 2 1 4 5 : 6 2 4 20 15


    }
}

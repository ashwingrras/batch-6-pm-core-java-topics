package org.example.arrays;

public class ArrayExample6
{
    public static void main(String[] args)
    {
        int[] array1 = {21, 24, 13, 16, 8};
                        // 8, 16, 13, 24, 21
        // another question
        //             { 8, 16, 13, 24, 21 }   1
        //             { 16, 8 ,13, 21, 24 }   2
        //             { 21, 8, 13, 16, 24 }   3
        //             { 8, 24, 13, 16, 21 }   4
        //             { 24, 21, 16, 13, 8 }   5
        //             { 8, 21, 24, 13, 16 }   6
        //             { 24, 21, 13, 16, 8 }   7
        // maximum : 24
        // minimum: 8
        // second maximum : 21
        // second minimum : 13
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0; i < array1.length; i++)
        {
            if(array1[i] > max)
            {
                secondMax = max;
                max = array1[i];
            }
            else if(array1[i] > secondMax && secondMax < max) {
                secondMax = array1[i];
            }
            if(array1[i] < min)
            {
                min = array1[i];
            }
        }
        System.out.println(" max value "+max);
        System.out.println(" secondMax value "+secondMax);
        System.out.println(" min value "+min);

        int a = 10;
        int b = 15;
        // a = 15, b = 10, temp,
        /*
            temp = a; temp = 10
            a = b; a = 15
            b = temp; b = 10

         */
    }
}

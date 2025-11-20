package org.example.arrays;

import java.util.Arrays;

public class MultiDimensionArrayExample1
{
    public static void main(String[] args) {

        int[][] twoDArray = new int[4] [0];
        System.out.println(" twoDArray length "+twoDArray.length);
        int randomValue = 5;
        for(int i=0; i < twoDArray.length; i++)
        {
            System.out.println("i "+i);
            //System.out.println("array "+ Arrays.toString(twoDArray[i]));
            if(i % 2 == 0)
            {
                randomValue = 5;
            }
            else
            {
                randomValue = 3;
            }
            twoDArray[i] = new int[randomValue];
            for(int j=0; j < twoDArray[i].length; j++)
            {
                System.out.print("j "+j +" ");
            }
            System.out.println();
        }
    }
}

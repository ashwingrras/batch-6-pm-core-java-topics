package org.example.arrays;

public class ArrayExample7
{
    public static void main(String[] args) {

        int[] array1 = {21, 24, 13, 16, 8};
        // 8, 16, 13, 24, 21
        // another question
        //             { 8, 16, 13, 24, 21 }   1
        //                     0 -> 4
        //                     1 -> 3
        //                     2 -> 2 : no swap
        //               0 -> len - 1
        //             { 16, 8 ,13, 21, 24 }   2
        //              0  -> 3   +
        //              1  -> 4   +
        //              2  -> 5 if value > length : no swap
        //             { 21, 8, 13, 16, 24 }   3
        //             { 8, 24, 13, 16, 21 }   4

        //             { 24, 21, 16, 13, 8 }   5
        //                0 -> 1
        //                2 -> 3
        //                4 -> no swap
        //
        //             {21, 24, 13, 16, 18}    input
        //             { 13, 21, 24, 16, 18 }  output 6
        //              0 -> 1, extra variable to store next  index  value
        //              1 -> 2
        //              2 -> 3
        //              3 -> 4
        //              4 -> 0
        //             { 24, 21, 13, 16, 8 }   7

        //               question 8
        //             i { 1, 3, 4, 2, 5, 7, 6 }
        //             o { 1, 2, 4, 3, 5, 7, 6 }
        //             i { 1, 7, 4, 3, 5, 2, 6 }
        //             o { 1, 2, 4, 3, 5, 7, 6 }
        //             i { 3, 7, 4, 1, 5, 2, 6 }
        //             o { 3, 4, 7, 1, 5, 2, 6 }

        //                question 9
        //             i { 3, 7, 4, 1, 5, 2, 6 }
        //             o { 3, 4, 7, 1, 2, 5, 6 }
    }
}

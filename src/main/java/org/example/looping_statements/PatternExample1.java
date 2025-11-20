package org.example.looping_statements;

public class PatternExample1
{
    public static void main(String[] args)
    {

        /*
            1 3 5 7 9 11 13
            2 4 6 8 10 12 14
            3 5 7 9 11 13 15
         */
        System.out.println(" first example ");
        for(int i =1; i <=3; i++)
        {
            int value = i;
            for(int j = 1; j <= 7; j++)
            {
                if(j > 1)
                {
                    value += 2;
                }
                System.out.print(value+" ");
            }
            System.out.println();
        }
        /*
            1:  2 3 1
            2:  3 1 2
            3:  1 2 3
         */
        System.out.println(" second example ");
        for(int i=1; i <=4; i++)
        {
            int value = i + 1; // 2, 3
            if(value > 3)
            {
                value = 1;
            }
            for(int j=1; j<=3; j++)
            {
                System.out.print(value+" "); // 2, 3, 1
                                         // 3, 1, 2
                                         // 1, 2, 3
                value++;
                if(value > 3)
                {
                    value = 1;
                }
            }
            System.out.println();
        }

    }
}

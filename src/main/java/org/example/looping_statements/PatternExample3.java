package org.example.looping_statements;

public class PatternExample3
{
    public static void main(String[] args) {
        /*
           1
           * * *
           *
           * * *
           2
           * * *
               *
           * * *
           3
           *
           *   *
           * * *
           4
               *
           *   *
           * * *
         */
        int no = 3;
        System.out.println(" first pattern ");
        for(int i =1; i <= no; i++)
        {
            for(int j=1; j <= no; j++)
            {
                if(i == 2 && ( j > 1))
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println(" second pattern ");
        for(int i =1; i <= no; i++)
        {
            for(int j=1; j <= no; j++)
            {
                if(i == 2 && ( j < 3))
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println(" third pattern ");
        for(int i =1; i <= no; i++)
        {
            for(int j=1; j <= no; j++)
            {
                if(i == 1 && ( j > 1) || (i==2 & j == 2))
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println(" fourth pattern ");
        for(int i =1; i <= no; i++)
        {
            for(int j=1; j <= no; j++)
            {
                if(i == 1 && ( j < 3) || (i==2 & j == 2))
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

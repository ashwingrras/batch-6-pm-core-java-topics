package org.example.looping_statements;

public class PatternExample2
{
    public static void main(String[] args)
    {

        System.out.println(" first pattern ");
        /*
            *
            * *
            * * *
            * * * *
         */
        for(int i=1; i <= 4; i++)
        {
            for(int j=1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
           * * * *
           * * *
           * *
           *
         */
        System.out.println(" second pattern ");

            // for i 1 .. 4  i++
            // for j 4 .. i  j--

        for(int i =1; i <=4; i++)
        {
            for(int j = 4; j >= i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        /////
        System.out.println(" third pattern");
        /*
            1     1
               1
            1     1
         */
        int no =3;
        for(int i =1; i <= no; i++)
        {
                for(int j =1; j <= no; j++)
                {
                        if( i == j || (i + j) == no + 1)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                }
            System.out.println();
        }
        System.out.println(" fourth question");
        //
            for(int i =1; i <=4; i++)
            {
                for(int j = 1; j <= 4; j++)
                {
                    if(j == 1 || i == 4 || j == 4 || i == 1)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        //
    }
}

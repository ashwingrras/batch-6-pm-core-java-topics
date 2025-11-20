package org.example.looping_statements;

public class NestedLoopExample
{
    public static void main(String[] args)
    {
        //
        // ashwin : jaipur, 34, 14,
        // mohit: lalsot, 20, 0, b.tech, java
        for(int i =1; i <= 3; i++)
        {
            for(int j = 1; j <= i; j++) // 1 .. 1, 1 .. 2, 1 .. 3
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("nested loop ");

        for(int i = 1; i <= 3; i++)
        {
            for(int j = 1; j <= 2*i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        for(int i =1; i <=3; i++)
        {
            for(int j=1; j <=3; j++)
            {
                if(j <= i) // 3 <= 1, 3 <= 2, 3 <=3
                {
                    System.out.print( j +" " );
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        // using nested loop
        //
        for(int i = 1; i <= 5; i++)
        {
            //System.out.println(" i "+i);
            for(int j = 1; j <= 5; j++)
            {
                System.out.print(j+"");
            }
            System.out.println();
        }
        //
        // using single loop
        int counter = 0;
        for(int i = 1; i <=5; i++)
        {
            System.out.print(i +" ");
            if(i == 5)
            {
                System.out.println();
                i = 0;
                counter++;
                if (counter == 5)
                    break;
            }
        }
    }
}

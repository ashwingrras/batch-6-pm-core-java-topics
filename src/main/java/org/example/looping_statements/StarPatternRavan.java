package org.example.looping_statements;

public class StarPatternRavan
{
    public static void main(String[] args)
    {
        for(int i=1; i <=8; i++)
        {
            for(int j=1; j <=13; j++)
            {
                // row 1 to 5
                if((i == 1 || i == 5) && j > 3 && j < 11)
                {
                    System.out.print("*");
                }
                // row 2 to 4
                else if((i > 1 && i < 5) && ( j == 4 || j == 10))
                {
                    System.out.print("*");
                }
                // row 3, hand
                else if(i == 3 && (j < 5 || j > 10))
                {
                    System.out.print("H");
                }
                // row 6 to till
                else if( i > 5 && (j == 6 || j == 8))
                {
                    System.out.print("*");
                }
                // eyes
                else if(i == 2 && (j == 6 || j == 8))
                {
                    System.out.print("@");
                }
                // mouth
                else if(i == 4 && j == 7)
                {
                    System.out.print("-");
                }
                // nose
                else if(i == 3 && j == 7)
                {
                    System.out.print("|");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

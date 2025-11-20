package org.example.arrays;

public class SeriesExample1
{
    public static void main(String[] args)
    {
        /*  1 2  3 4 5 6 7 8
            A 10 B 9 C 8 D 7
                 E 6 F 5 G 4
                     H 3 I 2
                         J 1
         */
        char ch = 65;
        int no = 10;
        int spaceTillNo = 2;
        for(int i =1; i <= 4; i++)
        {
            for(int j= 1; j <= 8; j++)
            {
                if(i > 1 && j <= spaceTillNo)
                {
                    System.out.print("  ");
                    continue;
                }
                else if(i > 1 && j <= spaceTillNo+1)
                {
                    System.out.print(" ");
                }
                if(j % 2 != 0)
                {
                    System.out.print(ch+" ");
                    ch++;
                }
                else
                {
                    System.out.print(no+" ");
                    no--;
                }
            }
            if(i > 1)
            {
                spaceTillNo += 2;
            }
            System.out.println();
        }
    }
}

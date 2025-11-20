package org.example.looping_statements;

public class LoopExample3
{
    public static void main(String[] args)
    {
        int no = 30;
        // first question:
        // 1, 3, 4, 7, 11, 18, 29
        // you can use loop, if else
        /*
            1     : 1 : prev : 1
            1 + 2 : 3 : curr : 3
            1 + 3 : 4, prev : 3, curr : 4
            3 + 4 : 7, prev : 4 , curr: 7
            4 + 7 : 11,

         */
        int prev = 1;
        int curr = 3;
        System.out.println(prev);
        System.out.println(curr);
        int result;
        System.out.println(" first question ");
        for(int i = 1; i <= 5; i++ )
        {
            result = prev + curr;
            System.out.println(result);
            prev = curr;
            curr = result;
        }
        System.out.println(" second question ");
        // second question
        // 1 3 6 10 15 21
        int counter = 2;
        int value = 1;
        for(int i = 1; i < 8; i++)
        {
            System.out.println(value);
            value += counter;
            counter++;
        }

        System.out.println(" third question ");
        // third question
        // 21 15 10 6 3 1
        value = 21;
        counter = 6;
        /*
        for(int i = 1; i < 7; i++)
        {
            System.out.println(value);
            value -= counter;
            counter--;
        }
        */
        int j = 1;
        while(j < 7)
        {
            System.out.println(value);
            value -= counter;
            counter--;
            j++;
        }
        // fourth question
        // 1 4 8 11 15 18 22 25

        System.out.println(" fifth example ");
        // fifth question
        // 1 2 3 4 5 4 3 2 1
        value = 1;
        for(int i = 1; i <= 9; i++)
        {
            System.out.print(value +" "); //1, 2, 3, 4, 5,
            if(i < 5)
            {
                value++;
            }
            else
            {
                value--;
            }
        }
        System.out.println();
        System.out.println(" sixth example");
        // sixth question
        // 1 2 1 2 1 2 1 2 1 2

        // seventh question
        // 5 4 3 2 1 2 3 4 5

        System.out.println(" eight question");
        // eight question
        //  1 2 4 8 16 32
        value = 1;
        for(int i =1; i <= 6; i++)
        {
            System.out.println(value);
            value *= 2;
        }
        // ninth question
        // 1 3 6 10 15 13 10 6 1
        // single loop
        value = 1;
        counter = 2;
        for(int i =1; i <= 9; i++)
        {
            System.out.print(value +" "); // 1, 3, 6, 10
            if(i < 5)
            {
                value += counter; // 3, 6, 10, 15
                counter++; // 3, 4, 5, 6
            }
            else
            {
                if(i == 5)
                {
                    counter = 2;
                }
                value -= counter;
                counter++;
            }
        }
        System.out.println();
        // tenth question
        // 1 9 2 8 3 7 4 6 5
        // single

        System.out.println(" eleventh question");
        // eleventh question
        // 1 10 5 14 7 16 8
        value = 1;
        for(int i = 1; i <=7; i++)
        {
            System.out.print(value+" "); // 1, 10, 5, 14, 7
            if(i % 2 != 0)
            {
                value  += 9;
            }
            else
            {
                value /= 2;
            }
        }
        System.out.println();

    }
}

package org.example.recursive_method;

// 1 3 6 10 15

public class RecursiveExample3
{
    public static void main(String[] args)
    {
        // 5 4 3 2 1
        int no = 5;
        printReverseSeries(no);
    }

    public static int printReverseSeries(int no)
    {
        System.out.println(no);
        if(no < 2)
        {
            return 1;
        }
        return printReverseSeries(no - 1);
    }
}

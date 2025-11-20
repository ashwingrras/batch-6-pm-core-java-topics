package org.example.recursive_method;

public class RecursiveExample1
{
    public static void main(String[] args)
    {
        int no = 5;
        //int factorial = 5 * 4 * 3 * 2;
        //System.out.println("factorial "+factorial);
        int fact = 1;
        for(int i = no; i > 1; i--)
        {
            fact *= i;
            // 1 *= 5 = 5
            // 5 *= 4 = 20
            // 10 *= 3 = 60
            // 60 *=2 = 120
        }
        System.out.println("fact "+fact);
        int returnValue = printNumber(5);
        System.out.println("return value "+returnValue);
    }

    public static int printNumber(int number)
    {
        System.out.println("number, before "+number);
        number--;
        System.out.println("number, after "+number);
        if(number > 0)
        {
           return number * printNumber(number) ;
        }
        System.out.println("number, after if "+number);
        //return 9;
        return number;
    }
}

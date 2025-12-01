package org.example.generics;

import java.util.function.BinaryOperator;

public class LambdaMain1
{
    public static void main(String[] args)
    {
        /*SumInterface sumInterface = new LambdaExample1();
        System.out.println(sumInterface.sum(10,5));*/

        SumInterface sumInterface1 = ((a, b, c) -> a + b + c);
        System.out.println(sumInterface1.sum(9,4, 4));

        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(10, 20));



    }
}

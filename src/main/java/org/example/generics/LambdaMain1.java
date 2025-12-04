package org.example.generics;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

/*
    exception handling
    file handling
    multi threading
    collections
    remaining part to generics
    date & time
    MySQL
    JDBC

 */

/*
    core java: 2500000
    spring : 25000
    Spring Boot: 2500
 */

/*
    1. Generics
        1.1 generic class
        1.2 generic interface
        1.3 generic method
        wildcards
    2. Lambda
        2.1 Functional Interface
        2.1 anonymous method




 */

public class LambdaMain1
{
    public static void main(String[] args)
    {
        /*SumInterface sumInterface = new LambdaExample1();
        System.out.println(sumInterface.sum(10,5));*/

        // anonymous  class: class without name
        SumInterface sumInterface = new SumInterface() {
            @Override
            public int sum(int a, int b, int c) {
                System.out.println("inside anonymous class sum method");
                return a + b + c;
            }
        };
        // with anonymous class
        System.out.println(sumInterface.sum(7,2, 2));

        // with interface reference, class object
        SumInterface sumInterfaceWithClass  = new TestClassForInterface();
        System.out.println(sumInterfaceWithClass.sum(5,1, 9));

        // with lambda expression
        SumInterface sumInterface1 = ((a, b, c) ->
                a + b + c
        );
        System.out.println(sumInterface1.sum(9,4, 4));

        // with block lambda
        SumInterface sumInterface2 = ((int a, int b, int c) ->
        {
            System.out.println("inside block lambda sum method");
            return a + b + c;
        }
        );
        System.out.println(sumInterface1.sum(9,4, 4));

        BinaryOperator<Integer> add = (a, b) -> a * b;
        System.out.println(add.apply(10, 20));

        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(5));

        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Length of 'Hello': " + stringLength.apply("Arpit"));





    }
}

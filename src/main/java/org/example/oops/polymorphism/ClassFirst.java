package org.example.oops.polymorphism;

/*
    polymorphism:
    1. method overloading : same name different argument (data type), no effect of return type
    2. method overriding  : same name same argument but in different class with relation, effect of return type


 */
public class ClassFirst
{
    int a = 10;

    public void sum()
    {
        System.out.println("at class first sum method");
    }
    public int sum(int a, int b)
    {
        return a + b;
    }

    public  int sum(int a, int b, int c)
    {
        return a + b + c;
    }


    public  double sum(double a, double b)
    {
        System.out.println("at class first");
        return a + b;
    }

    public  double sum(int a, double b)
    {
        return a + b;
    }

    public static double sum(double a, int b)
    {
        return a + b;
    }

    public double sum1(double a, int b)
    {
        return a + b;
    }

    public void testOverride()
    {
        System.out.println("test override at class first");
    }

}

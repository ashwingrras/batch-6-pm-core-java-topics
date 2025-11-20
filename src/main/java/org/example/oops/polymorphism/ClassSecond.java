package org.example.oops.polymorphism;

public class ClassSecond  extends ClassFirst
{
    int a = 15;
    @Override
    public void sum()
    {
        System.out.println("at class second sum method");
    }

    @Override
    public  double sum(double a, double b)
    {
        System.out.println("at class second");
        return a + b;
    }

    // no override allow with static method

    @Override
    public int sum(int a, int b)
    {
        return a + b;
    }

    @Override
    public double sum1(double a, int b)
    {
        return (a + b);
    }

    public void testOverride()
    {
        System.out.println("test override at class second");
    }

}

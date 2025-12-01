package org.example.generics;

@FunctionalInterface
public interface SumInterface
{
    int sum(int a, int b, int c);
    //int divide(int a, int b, int c);

    public static int divide(int a, int b)
    {
        return a / b;
    }
}

package org.example.generics;

@FunctionalInterface
public interface SumInterface
{
    // only single abstract method allowed
    int sum(int a, int b, int c);
    //int divide(int a, int b, int c);

     static int divide(int a, int b)
    {
        return a / b;
    }

     default int multiply(int a, int b)
    {
        return a * b;
    }
}

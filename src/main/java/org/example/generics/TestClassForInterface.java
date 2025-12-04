package org.example.generics;

public class TestClassForInterface implements SumInterface{
    @Override
    public int sum(int a, int b, int c) {
        System.out.println("inside TestClassForInterface sum method");
        return a + b + c;
    }
}

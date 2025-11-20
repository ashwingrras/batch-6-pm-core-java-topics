package org.example.oops.polymorphism;

public class MainClass
{
    public static void main(String[] args)
    {
            ClassFirst classFirst = new ClassSecond();
            System.out.println(classFirst.a);
            System.out.println(classFirst.sum(10.0,19.0));
    }
}

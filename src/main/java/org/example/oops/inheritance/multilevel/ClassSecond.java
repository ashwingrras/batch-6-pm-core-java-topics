package org.example.oops.inheritance.multilevel;

public class ClassSecond  extends ClassFirst
{
    String name = "akshita, class second";
    ClassSecond()
    {
        System.out.println("at class second constructor");
    }

    @Override
    public void sum()
    {
        System.out.println("at class second sum method");
    }

}

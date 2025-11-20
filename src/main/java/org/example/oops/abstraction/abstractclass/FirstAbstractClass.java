package org.example.oops.abstraction.abstractclass;

import org.example.oops.abstraction.interface_practice.NormalClass;

public abstract class FirstAbstractClass extends NormalClass
{
    int no = 10;
    // non - abstract method / concrete method
    public void normalMethod(double a, double b)
    {
        System.out.println("at normal method");
    }

    // abstract method
    public abstract int abstractMethod(int a, int b);

    public abstract int sum(int a, int b);

    public abstract int multiply(int a, int b);

}

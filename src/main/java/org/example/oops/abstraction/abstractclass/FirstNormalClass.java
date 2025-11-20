package org.example.oops.abstraction.abstractclass;

public class FirstNormalClass extends FirstAbstractClass
{

    @Override
    public int abstractMethod(int a, int b) {
        System.out.println("this is abstract method body");
        return a + b;
    }

    @Override
    public int sum(int a, int b) {
        System.out.println("this is abstract method body");
        return a + b;
    }

    @Override
    public int multiply(int a, int b) {
        System.out.println("this is abstract method body");
        return a * b;
    }
}

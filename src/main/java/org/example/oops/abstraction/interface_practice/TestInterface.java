package org.example.oops.abstraction.interface_practice;

// interface: methods by default public and abstract
public interface TestInterface
{
    static int a = 10;

    int sum(int a, int b);

    abstract public double sum(double a, int b);

    abstract public int multiply(int a, int b);

    // 1. static method
    static void testInterfaceStaticMethod(String name)
    {
        System.out.println("TestInterface, at testInterfaceStaticMethod method");
    }

    // 2. default method
    default void testInterfaceDefaultMethod(String name)
    {
        System.out.println("TestInterface, at testInterfaceDefaultMethod method");
    }
}

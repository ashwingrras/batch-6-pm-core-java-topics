package org.example.oops.abstraction.interface_practice;

/*
    class     : extends
    interface : implements

 */

public class TestClass extends NormalClass implements TestInterface , TestInterface2, TestInterface3 {

    @Override
    public int sum(int a, int b) {
        System.out.println("TestClass, inside sum method with int a, int b");
        return a + b;
    }

    @Override
    public double sum(double a, int b) {
        System.out.println("TestClass, inside sum method with double a, int b");
        return a + b;
    }

    @Override
    public int multiply(int a, int b) {
        System.out.println("TestClass, inside multiply method with ina a, int b");
        return a * b;
    }

    @Override
    public int testInterface2Method(String name) {

        TestInterface.testInterfaceStaticMethod("");
        System.out.println(TestInterface.a);
        return 0;
    }

    @Override
    public int testInterface3Method(String name) {
        return 0;
    }
}

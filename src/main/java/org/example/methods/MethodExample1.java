package org.example.methods;

/*
    variables
    1. static : will get memory ( reference ) on runtime
    2. non-static / instance : will not get memory until  object create
    3. local

    methods:
    1. static : will get memory ( reference ) on runtime
    2. non-static / instance : will not get memory until  object create





 */

public class MethodExample1
{
    // non-static variable / instance variable
    int a = 10;
    //static variable
    static int b = 15;

    static int rollNo = 101;

    static String instituteName = "Grras";

    public static int age = 34;

    public static void main(String[] args) {

        int c = 20; // local variable
        MethodExample1 object1 = new MethodExample1();
        //System.out.println(a);
        System.out.println(object1.a);
        System.out.println(b);
        System.out.println(object1.b); // will use directly
        int sumValue = sum(10,5);
        System.out.println("sumValue "+sumValue);
        //multiply(10,5);
        int multiplyValue = object1.multiply(10,5);
        System.out.println("multiplyValue "+multiplyValue);
    }

    /*
        difference between static and non-static method
     */
    // static
    public static int sum(int a , int b)
    {
        return  a + b;
    }

    // non-static
    public int multiply(int a , int b)
    {
        return  a * b;
    }
}

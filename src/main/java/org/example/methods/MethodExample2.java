package org.example.methods;

import java.util.Scanner;
import static org.example.methods.MethodExample1.age;
import static org.example.methods.MethodExample1.sum;

public class MethodExample2
{
    double  percentage = 77;
    public static void main(String[] args) {
        System.out.println("age "+age);
        age = 35;// static
        int total = sum(10,4);
        int a = 10;
        int b = 19;
    }

    public static int divide(int a, int b)
    {
        return a / b;
    }

    public int modulus(int a, int b)
    {
        printNumber(14);
        return a % b;
    }

    public void printNumber(int value)
    {
        System.out.println(" value "+value);
        printDouble(value, 10, 13,14);
    }

    // here double is return type
    /*
        method:

        1. name : any string name / label
        2. return type : double ( data type )
        3. access modifier : public , default
        4. arguments / parameters : value is argument

        5. method type : static / non-static

        non-argument method  =  methodName()
        with argument method =  methodName ( datatype identifier, ...)

     */
     public double printDouble(int value, int value1, int value2, double value3)
    {
        System.out.println(" value ");
        return 10.0;
    }

    public void testMethod1(int arg1, int arg2)
    {
        int arg3 = arg2;
        System.out.println("arg1 "+arg1);
    }



}

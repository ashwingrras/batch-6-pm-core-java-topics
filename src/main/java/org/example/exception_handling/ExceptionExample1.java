package org.example.exception_handling;

/*
    Exceptions:
    1. Checked: checked on compile time
        FileNotFound
        Sql

    2. Unchecked : checked on run time
        Arithmetic
        NullPointer
        ArrayIndexOutOfBound

        try : code block where have chances of exception

        catch : where exception handles


 */

import java.io.File;

public class ExceptionExample1
{
    static String name;
    public static void main(String[] args)
    {
        int no21 = 10 / 0;
        //name = "aman";
        System.out.println(" at main method ");
        // unchecked exception / null pointer exception
        System.out.println(name.length());
        File file = new File("abcd");
        file.mkdir();

        // checked exception , FileNotFound
        //FileReader fileReader = new FileReader("abcd");

        System.out.println(divide(10,0));
        System.out.println("after method divide call");
        double no1 = 10.0 / 0.0;
        System.out.println(no1);
        System.out.println("after no1");
        // unchecked exception , Number format exception
        int noStrToInt = convertStringToInt("10A0b0c");
        System.out.println("noStrToInt "+noStrToInt);


        int[] nos = new int[5];
        // unchecked exception, ArrayIndexOutOfBoundsException
        System.out.println(nos[10]);
        // unchecked exception , Arithmetic exception
        int no2 = 10 / 0;
        System.out.println(no2);
        System.out.println("after no2");
        // 03/12/2025, 03-12-2025, 03-dec-25



    }

    public static double divide(double a, double b)
    {
        return  a / b;
    }

    public static int convertStringToInt(String value)
    {
        return  Integer.parseInt(value);
    }
}

package org.example.exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExampleWithFinally
{
    public static void main(String[] args) {
        System.out.println("main method START");
        String transaction = "success";
        try
        {
            System.out.println("inside try");
            int[] nos = new int[5];
            System.out.println(nos[0]);
            int divide = 10 / 2;
            System.out.println(divide);
            System.out.println("before file read");
        }
        catch (Exception e)
        {
            transaction = "fail";
            System.out.println("at exception catch, exception message "+e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("inside finally block");
        }
    }




}

package org.example.exception_handling;

public class ExampleWithThrow
{
    public static void main(String[] args) {
        System.out.println("main method START");
        boolean isDivideSuccess = true;
        try
        {
            System.out.println("inside try");
            int result = divide(10, 0);
            System.out.println("result "+result);
        }
        catch (ArithmeticException e)
        {
            isDivideSuccess = false;
            System.out.println("at main method exception catch, exception message "+e.getMessage());
            //e.printStackTrace();
        }
        catch (Exception e)
        {
            isDivideSuccess = false;
            System.out.println("at main method exception catch, exception message "+e.getMessage());
            //e.printStackTrace();
        }
        System.out.println("isDivide "+isDivideSuccess);
    }

    public static int divide(int a, int b)
    {
        int result = 0;
        try
        {
            result = a / b;
        }
        catch (Exception  e)
        {
            System.out.println("at divide catch block, exception "+e.getMessage());
            throw new RuntimeException(e);
        }
        return  result;
    }

}

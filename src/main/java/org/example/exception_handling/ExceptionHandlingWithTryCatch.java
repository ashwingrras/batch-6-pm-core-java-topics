package org.example.exception_handling;

public class ExceptionHandlingWithTryCatch
{
    public static void main(String[] args) {
        System.out.println("main method START");
        try
        {
            System.out.println("inside try");
            int[] nos = new int[5];
            System.out.println(nos[10]);
            int divide = 10 / 0;
            System.out.println(divide);
        }
        /*catch (NullPointerException e)
        {
            System.out.println(" at null pointer exception");
        }
        catch (ArithmeticException e)
        {
            System.out.println(" at ArithmeticException  exception");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(" at ArrayIndexOutOfBoundsException  exception");
        }*/
        catch (Exception e)
        {
            System.out.println("at exception catch, exception message "+e.getMessage());
            e.printStackTrace();
        }

        int multiply = 10 * 4;
        System.out.println(multiply);
        System.out.println("main method END");
    }
}

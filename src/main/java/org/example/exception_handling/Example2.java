package org.example.exception_handling;

/*

    try with multiple catch in single catch block

    multi catch block : with help of | (pipe) sign

    final: class, variable, method

    exception handling

    1. try : code inside to handle/manage exceptions,
     it is used to where chances of exception occurs
    2. catch : caught the exceptions
    3. finally : every time control go to finally anyhow if exception occur or not
    4. throw : throw exception to calling method
    5. throws :

 */
public class Example2
{
    public static void main(String[] args)
    {
        System.out.println("main method START");
        try
        {
            System.out.println("inside try");
            int[] nos = new int[5];
            System.out.println(nos[0]);
            int divide = 10 / 2;
            System.out.println(divide);
        }
        /*catch (NullPointerException | ArithmeticException |  ArrayIndexOutOfBoundsException e)
        {
            System.out.println(" at multi exception catch block, exception message "+e.getMessage());
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

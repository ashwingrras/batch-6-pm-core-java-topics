package org.example.control_statements;

public class SwitchExample2
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 15;
        int result  = 0;
        String operation = "-";
        char ch = 'b';
        // vowel: a,e,i,o,u
        switch (ch)
        {
            case 'a','e','i','o','u':
                System.out.println(" this is vowel ");
                break;
            default:
                System.out.println(" this is constant ");

        }
    }
}

package org.example.control_statements;

public class Example1 {

    static String name;
    int a;

    public static void main(String[] args) {

        int a = 10;
        int b = 11;
        int c = 12;
        String max = null;
        if(a >  b && a > c)
        {
            max = "a";
        }
        else
        {
            if(b > c)
            {
                max = "b";
            }
            else
            {
                max = "c";
            }
        }
        System.out.println("max is : "+max);
    }
}

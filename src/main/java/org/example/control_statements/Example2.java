package org.example.control_statements;

/*

    control statements:
       1. if
       2. if, else
       3. if, else if
       4. nested if else: if inside if or if inside else
       5. switch
       6. jump statement: break , continue




 */
public class Example2
{
    public static void main(String[] args) {

        int a = 18;
        int b = 25;
        int c = 17;
        int d = 13;
        int e = 19;
        String max = "NA";
        String secondMax = "NA";
        int maxNumber = 0;
        int secondMaxNumber = 0;
        if(a > b && a > c && a > d && a > e)
        {
            max = "a";
            maxNumber = a;
            if(true) // nested
            {

            }
        }
        else if(b > c && b > d  && b > e)
        {
            max = "b";
            maxNumber = b;
        }
        else if(c > d && c > e)
        {
            max = "c";
            maxNumber = c;
        }
        else if(d > e)
        {
            max = "d";
            maxNumber = d;
        }
        else
        {
            max = "e";
            maxNumber = e;
        }
        System.out.println(" max "+max);
        //
        secondMaxNumber = 0;

        if (a != maxNumber && a > secondMaxNumber) secondMaxNumber = a; // a 17
        if (b != maxNumber && b > secondMaxNumber) secondMaxNumber = b;
        if (c != maxNumber && c > secondMaxNumber) secondMaxNumber = c; // c 18
        if (d != maxNumber && d > secondMaxNumber) secondMaxNumber = d;
        if (e != maxNumber && e > secondMaxNumber) secondMaxNumber = e;
        System.out.println(" secondMaxNumber "+secondMaxNumber);
    }
}

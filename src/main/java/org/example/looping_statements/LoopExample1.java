package org.example.looping_statements;

/*
    loops in java
    1. for
    2. while
    3. do while
    4. enhanced for ( for each )

 */
public class LoopExample1
{
    public static void main(String[] args)
    {
        System.out.println("before for loop");
        {

            System.out.println("aaaaa");
            System.out.println("bbbbb");
        }
        // for loop syntex
        int a = 10;
        if(a == 10);
            System.out.println("111 yes a == 10");
        System.out.println("222 yes a == 10");
        int no = 2;
        int tillValue = 10;
        int i = 1;
        for(; i <= tillValue; i++) // initialize ; condition(true/false) ; increment / decrement
            System.out.println("i * no 111 : "+ (no * i));

        System.out.println("after for loop");
    }
}

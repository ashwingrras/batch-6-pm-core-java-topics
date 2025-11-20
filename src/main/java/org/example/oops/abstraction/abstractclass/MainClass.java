package org.example.oops.abstraction.abstractclass;

/*
    Abstraction: ( Hide internal implementation / code )
    1. abstract class ( 0 to 100% abstraction )
    2. interface ( 100% abstraction )


 */
public class MainClass
{

    public static void main(String[] args)
    {
        FirstAbstractClass firstAbstractClass = new FirstNormalClass();
        System.out.println(firstAbstractClass.abstractMethod(10,10));
        System.out.println(firstAbstractClass.sum(10,10));
        System.out.println(firstAbstractClass.multiply(10,10));
    }

}

package org.example.oops.practice;

/*
    final keyword: similar to constants
    1. variable: can't change value, re-initialize not allowed
     1.1 static variable: compulsory to initialize while declare
     1.2 non-static variable: not compulsory to initialize while declare,
     but compulsory to assign with constructor

    2. class: can't inherit, but create object of final class

    3. method: can't override final method
       but can make final after override method to another class
 */



public class ClassFirst extends FinalMethodClass
{
    static public int no = 10;

    // final with non-static
    final String course;

    // final  with static
    final static String name = "mohit";

    static  int price = 149;
    public final String address = "lalsot";

    public ClassFirst(String course, String name) {
        this.course = course;
    }

    @Override
    public int sum(int a, int b)
    {
        System.out.println("inside sum ");
        return  a + b;
    }

    public static void main(String[] args)
    {
        System.out.println(name);
        System.out.println(no);
        no = 15;
        price = 150;
        //name = "ayush";
        System.out.println(no);
        System.out.println("now testing final class");
        TestFinalClass testFinalClass = new TestFinalClass();
        System.out.println(testFinalClass.name);
        testFinalClass.testMethod();
    }
}

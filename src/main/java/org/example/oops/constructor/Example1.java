package org.example.oops.constructor;

public class Example1
{

    // constructor:
    public Example1()
    {

        System.out.println("inside Example1 method");

    }

    int a = 10;
    public static void main(String args[])
    {
        System.out.println("inside main method ");
        Example1 obj1 = new Example1();
        //System.out.println("a "+obj1.a);
        //sum(10,18);
        //Users user1 = new Users(10, "rohan");
        Users user1 = new Users();
        user1.printUserInfo();
    }

    public static int sum(int a, int b)
    {
        return a+b;
    }

    public void printName(String name)
    {
        System.out.println("name "+name);
    }

}

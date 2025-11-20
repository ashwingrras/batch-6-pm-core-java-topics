package org.example.oops.constructor;

/*
    Constructor:

    1. default / non-parameterized
    2. parameterized
    3. copy



 */
public class Example2
{
    String name;
    int age;
    public Example2()
    {
        System.out.println("this is default constructor");
        name = "NA";
        age = 22;
    }

    public static int Example2()
    {
        System.out.println("this is normal method");
        return 10;
    }

    Example2(String name)
    {
        System.out.println("this is parameterized constructor with String name");
        this.name = name;
    }
//
    Example2(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void printName()
    {
        System.out.println("name "+name+", age "+this.age);
    }

    public static void main(String[] args)
    {
        Example2  student1 = new Example2();
        student1.printName();

        Example2  student2 = new Example2("Alwaz");
        student2.printName();
        Example2  student3 = new Example2("akshita",20);
        student3.printName();

        System.out.println(Example2.Example2());
    }

}

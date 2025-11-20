package org.example.oops.inheritance.multilevel;

public class MainClassOfFirstSecond
{
    public static void main(String[] args)
    {
        // have reference of class first but object is  class second
        // dynamic dispatch
        ClassFirst classObject = new ClassSecond(); // second + first
        System.out.println(classObject.name); // print class first variable
        classObject.sum(); // call class second method
    }
}

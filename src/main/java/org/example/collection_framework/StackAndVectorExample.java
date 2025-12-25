package org.example.collection_framework;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StackAndVectorExample
{
    public static void main(String[] args)
    {
        Stack<String> studentsList = new Stack<>();
        studentsList.add("tanishka");
        studentsList.add("akshita");
        studentsList.add("arpit");
        studentsList.add("vipul");
        studentsList.add("mohit");
        studentsList.add("krishna");
        studentsList.add("raj");
        studentsList.add("rishi");
        studentsList.add("vipul");


        System.out.println(studentsList);
        System.out.println(studentsList.pop());
        System.out.println(studentsList.peek());
        System.out.println(studentsList);

        for(int i =0; i < studentsList.size(); i++)
        {
            System.out.println(studentsList.get(i));
        }

        studentsList.push("vipul");
        System.out.println(studentsList);
        System.out.println(studentsList.firstElement());
        System.out.println(studentsList.lastElement());


        Vector<String> stringVector = new Vector<>();
        stringVector.add("tanishka");
        stringVector.add("akshita");
        stringVector.add("arpit");
        stringVector.add("vipul");
        stringVector.add("mohit");
        stringVector.add("krishna");
        stringVector.add("raj");
        stringVector.add("rishi");
        stringVector.add("vipul");



    }
}

package org.example.multithreading;

public class NormalExample
{
    public static void main(String[] args) {
        String[] names = {"akshiat","divyank","vipul","arpit"};
        String[] courses = {"dsa","java","python","web development"};
        for(String name : names)
        {
            System.out.println("name : "+name);
        }

        for(String course : courses)
        {
            System.out.println("course : "+course);
        }
    }
}

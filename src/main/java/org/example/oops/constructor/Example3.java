package org.example.oops.constructor;

import java.util.ArrayList;

public class Example3
{
    public static void main(String[] args)
    {
        // will get data from database
        /*
            java
            c
            c++
            dsa
         */

        Book book1 = new Book(101, "Java", "author 1", 100);
        Book book2 = new Book(102,"C","denis ricchi",50);
        System.out.println("book 1 "+book1.name);
        System.out.println("book 2 "+book2.name);
        Book book3 = new Book();
        System.out.println("book 3 "+book3.name);
        // copy constructor
        Book book4 = new Book(book2); // new object,
        book4.price = 190;
        // sharing reference of book2 to book4
        //Book book4 = book2; // new object,
        System.out.println("book 4 "+book4.name);
        book2.name = "DSA";
        System.out.println("book2 name "+book2.name);
        System.out.println("book 4 name "+book4.name);
        System.out.println("book 2 author "+book2.author);
        System.out.println("book 4 author "+book4.author);
        book4.author = "akshita";
        System.out.println("book 2 author "+book2.author);
        System.out.println("book 4 author "+book4.author);
    }

    public int sum(int a, int b)
    {
        return a + b;
    }


}

package org.example.oops.constructor;



public class Book
{
    int id;
    String name;
    String author;
    double price;

    // default
    Book()
    {

    }
    // parameterized
    Book(int id, String name, String author, double price)
    {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // parameterized + copy constructor
    Book(Book book)
    {
        this.id = book.id;
        this.name = book.name;
        this.author = book.author;
        this.price = book.price;
    }


}

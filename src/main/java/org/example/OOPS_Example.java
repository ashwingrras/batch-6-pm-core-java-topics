package org.example;

public class OOPS_Example
{
    public static void main(String[] args)
    {
        /*
        Person person1 = new Person();
        person1.greet();
        Person person2 = new Person("Ashwin",35);
        person2.greet();
        */

        /*
        Address address1 = new Address("jaipur");
        System.out.println(address1.name);
        address1.showDetails();
        */

        Animal animal = new Dog(); // dynamic dispatch
        animal.speak();
        animal.otherMethod();

    }
}

class Person

{

    String name = "Rohan";
    int age = 24;

    // non - parameterized constructor
    Person()
    {
        System.out.println(" at Person class constructor");
    }

    Person(String name1, int age1)
    {
        name = name1;
        age = age1;
    }

    public void greet()
    {
        System.out.println("name "+name+", age "+age);
    }

}

class Address extends Person
{
    String address;

    Address()
    {
        System.out.println(" at Address class constructor ");
    }

    Address(String address)
    {
        this.address = address;
    }

    public void showDetails()
    {
        System.out.println("name "+name+", age "+age+", address "+address);
    }

}


class Animal
{

    public void otherMethod()
    {
        System.out.println("inside other method");
    }

    public void speak()
    {
        System.out.println("Some animal sound");
    }

    public void speak(String name)
    {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal
{

    public void speak()
    {
        System.out.println("Dog sound as: Woof!");
    }


    public void checkBreed()
    {
        System.out.println(" at checkBreed method");
    }
}
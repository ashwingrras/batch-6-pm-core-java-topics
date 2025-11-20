package org.example.oops.constructor;

public class Users
{
    int id;
    String name;

    public Users()
    {

    }

    public Users(int id, String name)
    {
        this.name = name;
    }

    public void printUserInfo()
    {
        System.out.println("user name "+name);
    }

}

package org.example.oops.inheritance.multilevel;

public class GrandFather
{
    String grandFatherName = "grand father ";

    String surname = "grand father surname";
    GrandFather()
    {
        //System.out.println(grandFatherName);
    }

    public void atGrandFatherMethod()
    {
        System.out.println("at atGrandFatherMethod");
    }

    public void sum()
    {
        System.out.println("inside grandparent sum method");
    }

}

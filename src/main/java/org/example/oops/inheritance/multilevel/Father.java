package org.example.oops.inheritance.multilevel;

public class Father  extends  GrandFather
{
    String fatherName = "father name ";

    String surname = "father surname";
    Father()
    {
       //System.out.println(surname);
        System.out.println(super.surname);
        //System.out.println(fatherName);
        //System.out.println(grandFatherName);
    }

    public void atFatherMethod()
    {
        System.out.println("at atFatherMethod");
    }

    public void sum()
    {
        System.out.println("inside parent sum method");
        super.sum();
    }
}

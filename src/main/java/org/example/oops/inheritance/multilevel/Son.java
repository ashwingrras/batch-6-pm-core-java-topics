package org.example.oops.inheritance.multilevel;

public class Son extends Father
{
    String sonName = "son name";

    String surname = "son surname";
    Son()
    {
        System.out.println(super.surname);
        //System.out.println(surname);
        //System.out.println(sonName);
        //System.out.println(fatherName);
        //System.out.println(grandFatherName);
    }

    public void atSonMethod()
    {
        System.out.println("at atSonMethod, surname : "+this.surname ); // same class reference
        System.out.println("at atSonMethod, surname : "+super.surname ); // parent class  reference
    }

    public void sum()
    {
        System.out.println("inside son sum method");
        super.sum();
    }
}

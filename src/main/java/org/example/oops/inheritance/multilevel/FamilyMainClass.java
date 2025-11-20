package org.example.oops.inheritance.multilevel;

public class FamilyMainClass
{
    public static void main(String[] args)
    {
        Son son = new Son();
        System.out.println("with son object");
        System.out.println(son.sonName);
        System.out.println(son.fatherName);
        System.out.println(son.grandFatherName);
        son.atGrandFatherMethod();
        System.out.println(son.surname);
        System.out.println("with father object");
        Father father = new Father();
        System.out.println(father.fatherName);
        System.out.println(father.grandFatherName);
        father.atGrandFatherMethod();
        System.out.println("with grand father object");
        GrandFather grandFather = new GrandFather();
        System.out.println(grandFather.grandFatherName);


        // dynamic dispatch


    }

}

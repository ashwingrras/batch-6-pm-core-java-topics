package org.example.oops.inheritance.multilevel;

public class MainGetParentData
{
    public static void main(String[] args)
    {
        Son son = new Son();
        System.out.println(son.surname);
        son.sum();
        //son.atSonMethod();
        /*Father father =  new Father();
        System.out.println(father.surname);
        GrandFather grandFather = new GrandFather();
        System.out.println(grandFather.surname);*/
    }
}

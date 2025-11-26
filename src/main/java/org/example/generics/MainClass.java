package org.example.generics;

public class MainClass
{
    public static void main(String[] args) {
        NormalClass object1 = new NormalClass();
        object1.setName("mohit");
        object1.setValue("java");

        //int no = null;
        String abc = null;

        GenericClass1<String> genericObject1 = new GenericClass1<>();
        genericObject1.setValue("abcd");
        System.out.println(genericObject1.getValue());
        GenericClass1<Double> genericObject2 = new GenericClass1<>();
        genericObject2.setValue(100.00);
        System.out.println(genericObject2.getValue());

        GenericClass1<Character> genericObject3 = new GenericClass1<>();
        genericObject3.setValue('A');
        int val = genericObject3.getValue();
        System.out.println(genericObject3.getValue());
        System.out.println(val);

    }
}

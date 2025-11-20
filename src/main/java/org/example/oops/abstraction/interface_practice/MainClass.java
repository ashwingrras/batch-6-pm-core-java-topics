package org.example.oops.abstraction.interface_practice;

public class MainClass
{


    public static void main(String[] args)
    {
        TestInterface testInterfaceObj = new TestClass();
        testInterfaceObj.sum(10,5);
        testInterfaceObj.testInterfaceDefaultMethod("test");
        //testInterfaceObj.testInterfaceStaticMethod("test");
        TestInterface.testInterfaceStaticMethod("test");


        NormalClass normalClassObj = new NormalClass();
        normalClassObj.testClassStaticMethod("data");
        NormalClass.testClassStaticMethod("data");

    }



}

package org.example.oops.inner_classes;

public class MainClassFirst
{
    int no = 15;
    public static void main(String[] args)
    {



        OuterClass outerClass = new OuterClass();
        System.out.println(outerClass.no);
        System.out.println(outerClass.name);
        outerClass.outerMethod();

        //OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(new OuterClass().name);
        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
        innerClass.innerMethod();
        OuterClass.InnerClass.SubInner subInner = innerClass.new SubInner();
        subInner.subInnerMethod();
        //

        // directly using static property ( variable / method )
        System.out.println(OuterClass.address);
        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        staticInnerClass.staticInnerMethod();

    }
}

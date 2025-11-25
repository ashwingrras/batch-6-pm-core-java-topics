package org.example.oops.inner_classes;

/*

    inner / nested class: class inside class
    1. non-static / member inner class
    2. static class
    3. local inner class
    4. anonymous inner class
 */
public class OuterClass2
{

    int no = 10;
    String name = "vipul";

    static String address = "jaipur";

    public void outerClassMethod()
    {
        System.out.println("inside outerClassMethod");
        String course = "java"; // local variable
        // local inner class
        // similar to local variable, can't access outside method directly
        class OuterMethodClass
        {
            public void outerMethodClassMethod()
            {
                System.out.println("inside outerMethodClassMethod");
            }
        }

        OuterMethodClass outerMethodClass = new OuterMethodClass();
        outerMethodClass.outerMethodClassMethod();
    }

    interface LocalCallLocalInnerClassMethod
    {
        void outerMethodLocalInnerClassMethod2();
    }

    public void testLocalInnerClass()
    {
        // not allowed outside method, bcz local inner class similar to local variable
        //OuterMethodClass outerMethodClass = new OuterMethodClass();
        //outerMethodClass.outerMethodClassMethod();
    }

    // non-static / member inner class
    class InnerClass2
    {
        public void innerClassMethod()
        {
            System.out.println("inside innerClassMethod");
            class InnerClassMethodClass
            {

                public void innerClassMethodClassMethod()
                {
                    System.out.println("inside innerClassMethodClassMethod");
                }
            }
        }
    }

    // static inner class
    static class InnerStaticClass2
    {
        public void innerStaticClasMethod()
        {
            System.out.println("inside innerStaticClasMethod");
        }
    }

}

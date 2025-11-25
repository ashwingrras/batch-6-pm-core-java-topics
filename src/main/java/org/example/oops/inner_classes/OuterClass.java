package org.example.oops.inner_classes;
/*

    inner / nested class: class inside class
    1. non-static / member inner class
    2. static class
    3. local inner class
    4. anonymous inner class


 */

public class OuterClass
{

    int no = 10;
    String name = "vipul";

    static String address = "jaipur";

    public void outerMethod()
    {
        System.out.println(" inside outer method ");
    }

    static public void staticOuterMethod()
    {
        System.out.println(" inside static outer method ");
    }

    // member inner / non-static inner
    public class InnerClass
    {
        InnerClass()
        {
            System.out.println("inside InnerClassFirst constructor ");
        }
        public void innerMethod()
        {
            System.out.println(" inside inner method name "+name);
        }

        class SubInner
        {

            public void subInnerMethod()
            {
                System.out.println(" inside sub inner method, name "+name);
            }
        }

    }

    // static inner / static nested
    public static class StaticInnerClass
    {

        public void staticInnerMethod()
        {
            System.out.println(" inside static inner method, address "+address);
            staticOuterMethod();
        }

    }


}

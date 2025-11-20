package org.example.string;

public class StringExample1
{
    public static void main(String[] args)
    {
        int a = 1;
        System.out.println("a"+a);
        a = 4;
        System.out.println("a"+a);
        int[] nos1 = { 1, 4, 2, 3};
        int[] nos2 = new int[5];
        String name1 = "tanishka";
        String name2 = new String("Ayush");
        /*
            String:
            1. NonPrimitive
            2. Immutable : non-changeable
            3. Security Purpose
         */
        // ref: mohit@12341
        String value = "mohit"; // new object
        System.out.println("value "+value);

        System.out.println("value "+value);
        // ref: mohit@12341
        String value2 = "mohit";
        System.out.println(value == value2);

        // ref: Mohit@43987
        value = "Mohit"; // new object
        System.out.println(value.toLowerCase());
        System.out.println(value2);
        System.out.println(value.toLowerCase() == value2);
        String value3 = "mohit"; // no new object create, get reference from value2
        System.out.println(value2 == value3);

        String city = "jaipur";
        System.out.println("city "+city);
        city = "Jaipur"; //
        String address1 = "rajasthan";
        String address2 = "rajasthan";
        System.out.println(address1 == address2); // true
        address2 = "Rajasthan";
        System.out.println(address1 == address2); // false

        String course = "java"; // new object
        course.concat(" full stack");
        System.out.println("course = "+course);
        System.out.println("course = "+ course.toUpperCase());
        System.out.println("course = "+course.concat(" full stack"));
        System.out.println("course = "+course);
        course = course.concat(" full stack"); // new object
        System.out.println("course = "+course);
        System.out.println("course = "+course);
        int no = 10;
        System.out.println(no++);
        System.out.println(no);

        //
        String a1 = "abcd";
        String a2 = "abcd";
        String a3 = "abcd";
        System.out.println(a1 == a2);
        System.out.println(a2 == a3);
        String type1 = "string type 1";
        String type2 = new String("string type 1").intern();
        String type3 = new String("string type 1");
        System.out.println(type1 == type2);
        System.out.println(type1 == type3);



    }
}

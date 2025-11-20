package org.example.arrays;

import java.util.Arrays;

public class ArrayExample1
{

    /*
        data types:
        1. primitive ( actual value )
        2. non-primitive ( Reference )
            2.1 Array
            2.2 String
            2.3 Class
            2.4 Object

     */
    int d = 19; // non - static or instance variable
    public static void main(String[] args)
    {
        String name1 = "divyank";
        System.out.println(name1);
        String name2 = "ayush";
        System.out.println(name2);
        String name3 = "mohit";
        System.out.println(name3);
        int a = 10;
        System.out.println("a "+a);
        ArrayExample1 object1 = new ArrayExample1();
        System.out.println(object1);
        System.out.println(object1.d);

        // Array: collection of same data type values
        String[] names = {"divyank","ayush","mohit","tanishka",
                "akshita","krishna","vipul","alwaz","arpit"};


        System.out.println("names "  + names);
        System.out.println("names values "  + Arrays.toString(names));
        System.out.println("names array length "+names.length);

        // first way of array initialize, with values
        int[] nos = {1,2,3,4,5}; // values
        System.out.println(nos.length);
        System.out.println("index 4 value: "+nos[nos.length - 1]); // here 1 is index
        // second way of array, where we have give the length
        boolean[] values = new boolean[5]; // here 5 is length
        System.out.println("values "+Arrays.toString(values));

    }

}

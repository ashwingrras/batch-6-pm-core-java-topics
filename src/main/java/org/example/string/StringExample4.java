package org.example.string;

public class StringExample4
{
    public static void main(String[] args)
    {
        String value1 = "aaabceddefadc";
        // remove duplicate
        //      output: "abcdef"
        String result1 = ""; // abcdef
        System.out.println("value1 "+value1);
        for(int i=0; i < value1.length(); i++)
        {
            char ch1 = value1.charAt(i);
            if(!result1.contains(String.valueOf(ch1)))
            {
                result1 += ch1;
            }
        }
        System.out.println("result1 "+result1);
        String value2 = "abcaacbde";
        // count character frequency count
        // "abcde"
        // output: [ 3, 2, 2, 1, 1 ]

        String value3 = "india";
        // output "aidni" , without using revers() method

        String value4 = "aman gupta";
        // output: "aman atpug", without using revers() method

        String value5 = "aman gupta";
        // output: "nama gupta", without using revers() method

    }
}

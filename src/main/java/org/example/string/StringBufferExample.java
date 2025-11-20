package org.example.string;

public class StringBufferExample
{
    public static void main(String[] args)
    {
        String name = "mohit"; // new object
        name += "sharma"; // new object
        name += ","; // new object
        String value1 = "aaabceddefadc";
        // remove duplicate
        //      output: "abcdef"
        StringBuffer result1 = new StringBuffer(10); // abcdef
        System.out.println("value1 "+value1);
        for(int i=0; i < value1.length(); i++)
        {
            char ch1 = value1.charAt(i);
            if(!result1.toString().contains(String.valueOf(ch1)))
            {
                result1.append(ch1);
            }
        }
        System.out.println("result1 "+result1);
    }
}

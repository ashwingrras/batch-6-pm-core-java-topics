package org.example.string;

import java.util.Arrays;

public class StringExample5
{
    public static void main(String[] args) {
        String value1 = "abcaacbde";
        // count character frequency count
        // "abcde"
        // output: [ 3, 2, 2, 1, 1 ]

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
        System.out.println("result "+result1);
        int[] value1Array = new int[result1.length()];
        System.out.println("value1Array "+ Arrays.toString(value1Array));
        for(int i =0; i < result1.length(); i++)
        {
            char ch= result1.charAt(i);
            int count = 0;
            for(int j=0; j < value1.length(); j++)
            {
                if(ch == value1.charAt(j))
                {
                    count++;
                }
            }
            value1Array[i]= count;
        }
        System.out.println("value1Array "+ Arrays.toString(value1Array));
        String value3 = "india";
        String value3Result = "";
        for(int i=value3.length()-1; i >= 0; i--)
        {
            value3Result += value3.charAt(i);
        }
        System.out.println("value3Result "+value3Result);
        // output "aidni" , without using revers() method

        String value4 = "aman gupta";
        int cc = 'A';
        System.out.println(cc);
        // output: "aman atpug", without using revers() method

        String value5 = "aman gupta";
        // output: "nama gupta", without using revers() method


        String value6 = "abc def ghi jkl mno";
        //              "cba def ihg jkl onm"
        String[] value6Split = value6.split(" ");
        System.out.println("value6Split: "+Arrays.toString(value6Split));
        String value6Result = "";
        String[] value6ArrayResult = new String[value6Split.length];
        for(int i=0; i <value6Split.length; i++)
        {
            String value = value6Split[i];
            if(i %2 == 0)
            {
                String valueRevers = "";
                for(int j=value.length()-1; j >= 0; j--)
                {
                    valueRevers += value.charAt(j);
                }
                value6Result += valueRevers;
            }
            else
            {
                value6Result += value;
            }
            value6ArrayResult[i] = value;
            value6Result += " ";
        }
        System.out.println(" value6Result "+value6Result);
        System.out.println("value6ArrayResult: "+Arrays.toString(value6ArrayResult));
        String value7 = "abcdefgi";
        //              "igfedcba"
        //               0       len - i - 1
        //               1        len-2
        //               2        len-3
        String value8 = "abcdefgijklm";
        //              "mlkabcjigdef"
        //               12, 0-11
        //               11-2 : 9 to 11 ; klm
        //               9-11 reverse : add in 0-2
        // "mlk" += "abcdefgij"
                        // "mlkabcdefgij"
        //                 jig
        //               9-11 reverse : add in 6-8
        // check string have all unique character
        //Input: "abcdef" → true
        //Input: "hello" → false
        //Run Length with String
        //Input: "aaabbccaaa"
        //Output: "a3b2c2a3"

        String value9 = "ab9c30de6";
        //              "abcde9306"
        int ch = 'Z';
        System.out.println(ch);
        String onlyString = "";
        String onlyNumber = "";
        for(int i=0;i < value9.length(); i++)
        {
            if((value9.charAt(i) >= 'A' && value9.charAt(i) <= 'Z') || (value9.charAt(i) >= 'a' && value9.charAt(i) <= 'z'))
            {
                onlyString += String.valueOf(value9.charAt(i));
            }
            else
            {
                onlyNumber += String.valueOf(value9.charAt(i));
            }
        }
        System.out.println("onlyString " +onlyString);
        System.out.println("onlyNumber " +onlyNumber);
        String value9Result = onlyString + onlyNumber;
        System.out.println("value9Result " +value9Result);
        String value10 = "abZmiCoG";
        //            0 - 2
        //            3- 5
        //            6 -7
        // result:       "ZbaCimGo"
        // step 1 start
        //               "ZbaCimGo"
        //               find first capital letter : >= 'A' && <= 'Z'
        //               index find out capital, find previous string
        //               index 0 to 1 : ab, reverse
        //               Z at 0 index and then reverse String
        // step 1 end   "Zba"
        // step 2 start
        //               "miCoG"
        // step 2 end   "Cim"
        // step 3 start
        //               "oG";
        // step 3 end    "Go"
        // append : step1 to step3 end string

        // String value11 = "abc"
        // a b c ab bc abc


    }

}

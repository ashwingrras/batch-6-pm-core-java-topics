package org.example.string;

import java.util.Arrays;

public class StringExample2
{
    public static void main(String[] args) {
        String emailId_1 = "mohit@gmail.com";
        String emailId_2 = "mohit@gmail.com";
        System.out.println(emailId_1 == emailId_2); // check reference
        System.out.println(emailId_1.equals(emailId_2)); // check  value
        System.out.println(emailId_1.equalsIgnoreCase(emailId_2)); // check  value without case check

        String mobileNo = "9799605400";
        System.out.println(mobileNo.length());
        if(mobileNo.length() == 10)
        {
            System.out.println("valid mobile number");
        }
        else
        {
            System.out.println("invalid mobile number");
        }
        String name1 = "mohit SHarma";
        System.out.println(name1.toUpperCase());
        System.out.println(name1.toLowerCase());

        System.out.println(emailId_1.contains("@"));
        int no = 123456;
        String city = "jaipur";
        System.out.println(city.charAt(3));
        for(int i =0; i < city.length(); i++)
        {
            System.out.println(city.charAt(i));
        }

        String dob1 = "10/101992";
        String dob2 = "9-04-2005";
        String dob3 = "8/7/2011";

        String[] dob1Split = dob2.split("-");
        System.out.println(Arrays.toString(dob1Split));

        String fullAddress =  "jaipur, rajasthan, india";
        System.out.println(fullAddress.substring(19,24));


    }
}

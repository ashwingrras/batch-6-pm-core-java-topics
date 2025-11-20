package org.example.string;

import java.util.Arrays;

public class StringExample3
{
    public static void main(String[] args)
    {
        // alwaz: reverse, replace, concat
        String name = "hoit";
        //name = name.replace("mohit","rohit");
        System.out.println("name "+name);
        String address = "jaipur, rajasthan, india";
        String subAddress = address.substring(5);
        System.out.println("subAddress "+subAddress);
        subAddress = address.substring(0, 6);
        System.out.println("subAddress "+subAddress);
        System.out.println("name "+name);
        System.out.println(name.indexOf("hoio"));
        String country = "india";
        System.out.println(country.toCharArray());
        for(int i =0; i < country.length(); i++)
        {
            System.out.println(country.charAt(i));
        }
        char[] charCountry = country.toCharArray();
        for(int i =0; i < charCountry.length; i++)
        {
            System.out.println(charCountry[i]);
        }
        System.out.println(charCountry);
        char[] chars = {'a','b','c'};
        System.out.println(chars.length);
        System.out.println(Arrays.toString(chars));
        char ch1 = '\u0000';
        String fullName = "mohit\u0021";
        System.out.println("fullName "+fullName);
        System.out.println(fullName.length());
        System.out.println(fullName.trim());
        System.out.println(fullName.trim().length());
        System.out.println(fullName.strip().length());
        // find difference between trim and strip

        String  value1 = "a";
        System.out.println(value1.compareTo("A"));
    }
}

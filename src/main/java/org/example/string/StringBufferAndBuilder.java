package org.example.string;

import java.util.Date;

public class StringBufferAndBuilder
{
    public static void main(String[] args)
    {

        // StringBuffer
        /*
            Multi Threading
            1. thread safe
            2. mutable
            3. slower compare to StringBuilder

         */
        //
        /*
            1. thread unsafe
            2. mutable
            3. faster compare to StringBuffer
         */
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println("capacity 1: blank value "+stringBuffer.capacity());
        stringBuffer.append("12345678901234567890");
        // currentCapacity * 2 + 2
        System.out.println(stringBuffer.length());

        System.out.println("capacity 1: with value "+stringBuffer.capacity());
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("capacity 2: "+stringBuilder.capacity());

        stringBuilder.append("mohit");
        stringBuilder.append(" sharma");
        stringBuilder.insert(0,"Mr. ");

        System.out.println(stringBuilder);
        String name = stringBuilder.toString();
        StringBuilder stringBuilder1 = new StringBuilder("abc");

        StringBuffer stringBuffer1 = new StringBuffer();
        System.out.println("start : "+new Date());
        Date start1 = new Date();
        for(int i=0; i < 100000000; i++)
        {
            stringBuffer1.append(i);
        }
        Date end1 = new Date();
        long diff1 = end1.getTime() - start1.getTime();
        System.out.println("end : "+new Date());
        System.out.println("diff buffer "+diff1);

        StringBuilder stringBuilder2 = new StringBuilder();
        System.out.println("start : "+new Date());
        Date start = new Date();
        for(int i=0; i < 100000000; i++)
        {
            stringBuilder2.append(i);
        }
        Date end = new Date();
        long diff = end.getTime() - start.getTime();
        System.out.println("end : "+new Date());
        System.out.println("diff builder "+diff);


    }
}

package org.example.collection_framework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample1
{
    public static void main(String[] args) {
        Set<String> rollNos = new HashSet<>();
        rollNos.add("101");
        rollNos.add("102");
        rollNos.add("103");
        rollNos.add("104");
        rollNos.add("105");
        rollNos.add("106");
        rollNos.add("107");
        rollNos.add("108");
        rollNos.add("109");
        rollNos.add("110");
        rollNos.add("111"); // 111 -> akl@ljot111kjdoog
        rollNos.add("201");
        rollNos.add("202");
        System.out.println("rollNos "+rollNos);

        /*for(int i =0; i < rollNos.size(); i++)
        {
            System.out.println(rollNos.get(i));
        }*/
        System.out.println("enhanced");
        // enhanced loop
        for(String rollNo : rollNos)
        {
            System.out.print(rollNo+", ");
        }
        System.out.println();
        System.out.println("forEach");
        // forEach
        rollNos.forEach(rollNo -> {
            System.out.println("rollNo : "+rollNo);
        });
        //
        //Iterator
        Object[] setToArray = rollNos.toArray();
        System.out.println(Arrays.toString(setToArray));
        System.out.println(setToArray[4]);
    }
}

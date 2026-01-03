package org.example.collection_framework;

import java.util.Iterator;
import java.util.TreeSet;

/*
        1. HashSet : unique element, unordered
        2. LinkedHashSet : unique, insertion order
        3. TreeSet :  unique, asc order by default

 */
public class TreeSetExample1
{
    //
    public static void main(String[] args) {
        TreeSet<Double> studentRating = new TreeSet<>();
        studentRating.add(1.0);
        studentRating.add(1.5);
        studentRating.add(1.7);
        studentRating.add(1.8);
        studentRating.add(2.0);
        studentRating.add(2.1);
        studentRating.add(5.1);
        System.out.println(studentRating.ceiling(2.1));
        System.out.println(studentRating.floor(1.2));
        // 1.5: 2
        // 1.2 : 1
        //System.out.println(studentNames.descendingSet());
        Iterator<Double> iterator = studentRating.iterator();

        System.out.println(studentRating);
        // Iterate through the HashSet
        while (iterator.hasNext()) {
            Double rating = iterator.next();
            if(rating > 2)
            {
                //iterator.remove();
                continue;
            }
            System.out.print(rating+", ");
        }
        System.out.println();
        System.out.println(studentRating);
        //System.out.println(studentRating.pollFirst());
        //System.out.println(studentRating);
        System.out.println(studentRating.subSet(1.0, 5.1));
        System.out.println(studentRating.subSet(1.0,false,5.1,true));
    }
}

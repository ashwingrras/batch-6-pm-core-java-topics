package org.example.collection_framework;

import java.util.LinkedHashSet;

public class LinkedHashSetExample1
{

    public static void main(String[] args)
    {
        LinkedHashSet<String> studentNames = new LinkedHashSet<>();
        studentNames.add("arpit");
        studentNames.add("vipul");
        studentNames.add("tanishka");
        studentNames.add("alwaz");
        studentNames.add("akshiat");
        System.out.println("studentName before : "+studentNames);
        //Object studentClone = studentNames.clone();
        //LinkedHashSet<String> studentOtherSet = new LinkedHashSet<>(studentNames);
        LinkedHashSet<String> studentOtherSet = studentNames;
        //addTrainerName((LinkedHashSet<String>) studentClone);
        addTrainerName(studentOtherSet);
        System.out.println("studentName after : "+studentNames);
        System.out.println("studentsClone : "+studentOtherSet);
        //System.out.println(convertToUpperCase(studentNames));
    }

    /*public static LinkedHashSet<String> convertToUpperCase(LinkedHashSet<String> studentNames)
    {

        LinkedHashSet<String> modifiedSet = new LinkedHashSet<>();
        for(String name : studentNames)
        {
            //studentNames.remove(name);
            modifiedSet.add(name.toUpperCase());
        }
        return modifiedSet;
    }*/

    public static void addTrainerName(LinkedHashSet<String> studentNames)
    {
        studentNames.add("ashwin");
        studentNames.add("ravi");
        studentNames.add("vikash");
    }


}

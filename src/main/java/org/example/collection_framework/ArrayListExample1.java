package org.example.collection_framework;

/*
   List : Interface
     ArrayList
     LinkedList
     Vector
     Stack



 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample1
{
    public static void main(String[] args) {

        List<String> studentsList = new ArrayList<>();
        studentsList.add("tanishka");
        studentsList.add("akshita");
        studentsList.add("arpit");
        studentsList.add("vipul");
        studentsList.add("mohit");
        studentsList.add("krishna");
        studentsList.add("raj");
        studentsList.add("rishi");
        studentsList.add("vipul");
        studentsList.add(null);
        studentsList.add(null);
        studentsList.add(null);
        studentsList.add(null);


        System.out.println("studentsList : "+studentsList);
        System.out.println(studentsList.get(3));

        for(int i =0; i < studentsList.size(); i++)
        {
            System.out.println(studentsList.get(i));
        }

        for (String student : studentsList) {
            System.out.println(student);
        }

        studentsList.add(0, "ashwin");
        System.out.println("--------");
        System.out.println("studentsList : "+studentsList);
        studentsList.remove("ashwin");
        System.out.println("studentsList : "+studentsList);
        studentsList.addAll(studentsList);
        System.out.println("studentsList : "+studentsList);
        //studentsList.clear();
        System.out.println("studentsList : "+studentsList);
        System.out.println(studentsList.contains("divyank"));
        System.out.println(studentsList.isEmpty());
        List<String> newStudents = new ArrayList<>();
        newStudents.add("vipuls");
        System.out.println(studentsList.containsAll(newStudents));

        // for, while, do while, enhanced for / for each, forEach
        studentsList.forEach(item -> {
            System.out.println(item);
        });

        System.out.println(studentsList.indexOf("vipul"));
        System.out.println(studentsList.lastIndexOf("vipul"));



    }
}

package org.example.oops.inheritance.singlelevel;

public class MainClass
{
    public static void main(String[] args)
    {
        Students students = new Students();
        System.out.println(students.companyName);
        System.out.println(students.studentName);
        System.out.println(students.studentCourse);
        System.out.println(students.phoneNo);
        // private variable, so not allow outside class
        //System.out.println(students.password);
    }
}

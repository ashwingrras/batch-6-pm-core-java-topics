package org.example.oops.constructor;

// for constructor
public class Students
{
    int student_id;
    String name;
    int age;
    String course;
    String address;

    // default
    public Students()
    {

    }

    public Students(int student_id, String name)
    {
        this.student_id = student_id;
        this.name = name;
    }

    Students(int student_id, String name, int age, String course, String address)
    {
        this.student_id = student_id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.address = address;
    }

    // normal method
    public void sendDataToClass(int student_id, String name)
    {
        this.student_id = student_id;
        this.name = name;
    }



}

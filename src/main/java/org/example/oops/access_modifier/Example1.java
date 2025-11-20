package org.example.oops.access_modifier;

import org.example.oops.inheritance.singlelevel.Students;

/*
    Access Modifier:
    1. public    : available / allow on whole project
    2. default   : allow on same package only
    3. private   : allow on same class only
    4. protected : allow on same package only and allow outside package with relation only
 */
public class Example1 extends Students
{
    public static void main(String[] args)
    {
        Students students = new Students();
        System.out.println(students.companyName);
        System.out.println(students.studentName);
        Example1 example1 = new Example1();
        System.out.println(example1.phoneNo);

        //outside package variable with default modifier
        //System.out.println(students.studentCourse);
        example1.printStudentInfo();
    }

    public void testProtected()
    {
        Students students = new Students();
        System.out.println(students.companyName);
        System.out.println(students.studentName);
        //outside package variable with default modifier
        //System.out.println(students.studentCourse);
        System.out.println(phoneNo);
        System.out.println(companyName);
        printStudentInfo();
        showWelcome();
    }

}

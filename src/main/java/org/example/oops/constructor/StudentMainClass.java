package org.example.oops.constructor;

public class StudentMainClass
{
    public static void main(String[] args)
    {
        // get data from database
        /*
            1	bhavika	20	java	Delhi
            2	vatsala	20	java	Mumbai
            3	lakshya	21	java	Jaipur
            4	ashwin	34	java	amritsar
            5	keshav	14	java	jaipur
         */
        Students student1 = new Students(1,"bhavika",20,"java","Delhi");
        System.out.println(student1.name);
        System.out.println(student1.course);

        Students student2 = new Students(2, "dhanraj");
        System.out.println(student2.name);
        System.out.println(student2.course);

        Students student3 = new Students();
        System.out.println(student3.name);
        student3.sendDataToClass(3, "rohan");
        System.out.println(student3.name);

    }
}

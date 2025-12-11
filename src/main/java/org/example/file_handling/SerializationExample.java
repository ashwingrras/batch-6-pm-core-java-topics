package org.example.file_handling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample
{
    public static void main(String[] args) throws IOException {

        Student student1 = new Student(101,"Akshita",20);
        Student student2 = new Student(101,"Divyank",20);
        Student student3 = new Student(101,"Arpit",20);
        Student student4 = new Student(101,"Vipul",20);
        Student student5 = new Student(101,"krishna",20);
        FileOutputStream fos = new FileOutputStream("D:\\batch-4-pm-11-august-2025\\core-java-topics\\src\\main\\java\\org\\example\\file_handling\\students.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student1);
        oos.writeObject(student2);
        oos.writeObject(student3);
        oos.writeObject(student4);
        oos.writeObject(student5);
        oos.flush();
        System.out.println("serialization successful");
    }
}

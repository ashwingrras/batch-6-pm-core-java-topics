package org.example.file_handling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterExample
{
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("D:\\batch-4-pm-11-august-2025\\core-java-topics\\src\\main\\java\\org\\example\\file_handling\\student-list.txt");
        writer.write("Divyank \n");
        writer.write("Arpit \n");
        writer.write(65);
        writer.close();
        System.out.println("write successful");


    }
}

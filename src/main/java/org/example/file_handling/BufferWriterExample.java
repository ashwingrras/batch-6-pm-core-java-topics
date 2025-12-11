package org.example.file_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferWriterExample
{
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("D:\\batch-4-pm-11-august-2025\\core-java-topics\\src\\main\\java\\org\\example\\file_handling\\student-list.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("Divyank \n");
        bufferedWriter.write("Arpit \n");
        bufferedWriter.close();
        System.out.println("write successful");
    }
}

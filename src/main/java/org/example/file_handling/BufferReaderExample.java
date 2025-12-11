package org.example.file_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample
{
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("D:\\batch-4-pm-11-august-2025\\core-java-topics\\src\\main\\java\\org\\example\\file_handling\\student-list.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        int data = bufferedReader.read();
        while(data != -1)
        {
            System.out.print((char) data);
            data = bufferedReader.read();
        }
        System.out.println("read successful");
    }
}

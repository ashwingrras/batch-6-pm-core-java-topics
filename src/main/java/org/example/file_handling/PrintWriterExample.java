package org.example.file_handling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterExample
{
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter("D:\\batch-4-pm-11-august-2025\\core-java-topics\\src\\main\\java\\org\\example\\file_handling\\test-writer.txt");
        printWriter.write("vipul ");
        printWriter.write(65);
        printWriter.print(65);
        printWriter.print(true);
        printWriter.print(99.99);
        printWriter.close();

        PrintWriter printWriter1 = new PrintWriter(System.out);
        printWriter1.print("from print writer");
        printWriter1.close();
        System.out.println();


    }
}

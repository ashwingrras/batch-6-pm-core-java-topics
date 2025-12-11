package org.example.file_handling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamExample
{
    public static void main(String[] args) throws IOException {
        System.out.println("at main method");
        PrintStream printStream = new PrintStream("D:\\batch-4-pm-11-august-2025\\core-java-topics\\src\\main\\java\\org\\example\\file_handling\\test-stream.txt");
        printStream.print("abcd");
        printStream.write(65);
        printStream.print(67.70);
        printStream.close();

        PrintStream printStream1 = new PrintStream(System.out);
        printStream1.print("hello user");
        printStream1.print(67.70);
        printStream1.write(65);
    }
}

package org.example.file_handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample
{
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\batch-4-pm-11-august-2025\\core-java-topics\\src\\main\\java\\org\\example\\file_handling\\test-file-out-stream.txt");
        fileOutputStream.write(65);
        byte[] array = {65,66,67,68};
        //fileOutputStream.write("abcd".getBytes());
        fileOutputStream.write(array);

        fileOutputStream.close();

    }
}

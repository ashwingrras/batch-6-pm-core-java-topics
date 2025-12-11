package org.example.file_handling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStreamExample
{
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\batch-4-pm-11-august-2025\\core-java-topics\\src\\main\\java\\org\\example\\file_handling\\test-file-buff-out-stream.txt");
        BufferedOutputStream bufferOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferOutputStream.write(65);
        byte[] array = {65,66,67,68};
        //fileOutputStream.write("abcd".getBytes());
        bufferOutputStream.write(array);

        bufferOutputStream.close();
    }
}

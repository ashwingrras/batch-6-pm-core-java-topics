package org.example.file_handling;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample
{
    public static void main(String[] args) throws IOException {
        FileOutputStream fout1=new FileOutputStream("D:\\batch-4-pm-11-august-2025\\core-java-topics\\src\\main\\java\\org\\example\\file_handling\\f1.txt");
        FileOutputStream fout2=new FileOutputStream("D:\\batch-4-pm-11-august-2025\\core-java-topics\\src\\main\\java\\org\\example\\file_handling\\f2.txt");

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(65);
        byteArrayOutputStream.writeTo(fout1);
        byteArrayOutputStream.writeTo(fout2);
        byteArrayOutputStream.close();
    }
}

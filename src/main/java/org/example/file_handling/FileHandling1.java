package org.example.file_handling;

import java.io.*;

public class FileHandling1
{
    public static void main(String[] args) {

        try
        {
            File file = new File("D:\\batch-4-pm-11-august-2025\\core-java-topics\\src\\main\\java\\org\\example\\file_handling1");
            //System.out.println(file.createNewFile());
            //System.out.println(file.delete());
            Writer writer = new FileWriter("D:\\batch-4-pm-11-august-2025\\core-java-topics\\src\\main\\java\\org\\example\\file_handling\\vipul.txt");
            writer.write("hello");
            //writer.flush();
            writer.close();

            Reader reader = new FileReader("D:\\batch-4-pm-11-august-2025\\core-java-topics\\src\\main\\java\\org\\example\\file_handling\\vipul.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

package org.example.file_handling;

import java.io.*;

public class FileWriterAndReaderExample
{
    public static void main(String[] args)
    {

        Writer writer = null;
        Reader reader = null;
        try {
            /*writer = new FileWriter("D:\\batch-4-pm-11-august-2025\\core-java-topics\\src\\main\\java\\org\\example\\file_handling\\student-list.txt",true);
            writer.write("Divyank \n");
            writer.write("Arpit \n");
            //writer.flush();
            writer.close();
            System.out.println("write successful");*/
            reader = new FileReader("D:\\batch-4-pm-11-august-2025\\core-java-topics\\src\\main\\java\\org\\example\\file_handling\\student-list.txt");
            /*
            int data = reader.read();
            while(data != -1)
            {
                System.out.print((char) data);
                data = reader.read();
            }*/
            BufferedReader bufferedReader=new BufferedReader(reader);
            System.out.println(bufferedReader.readLine());
            /*int data = bufferedReader.read();
            while(data != -1)
            {
                System.out.print((char) data);
                data = bufferedReader.read();
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

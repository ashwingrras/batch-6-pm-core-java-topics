package org.example.exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExampleWithThrows
{
    public static void main(String[] args) {
        System.out.println("main method START");
        boolean isFileReadSuccess = true;
        try
        {
            System.out.println("inside try");
            System.out.println("before read");
            readFile();
            System.out.println("after read ");
        }
        catch (Exception e)
        {
            isFileReadSuccess = false;
            System.out.println("at main method exception catch, exception message "+e.getMessage());
            //e.printStackTrace();
        }
        System.out.println("isFileReadSuccess "+isFileReadSuccess);
    }

    public static void readFile() throws FileNotFoundException {

        System.out.println("inside readFile");
        FileReader  fileReader = new FileReader("abcd");
    }

}

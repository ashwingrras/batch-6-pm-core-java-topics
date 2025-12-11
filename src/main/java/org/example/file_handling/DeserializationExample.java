package org.example.file_handling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExample
{
    public static void main(String[] args)  {
        try
        {
            FileInputStream fis = new FileInputStream("D:\\batch-4-pm-11-august-2025\\core-java-topics\\src\\main\\java\\org\\example\\file_handling\\students.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(true)
            {
                try
                {
                    Student studentRead1 = (Student) ois.readObject();
                    if(null != studentRead1 && null != studentRead1.name)
                    {
                        System.out.println("deserialize student : "+studentRead1.name);
                    }
                    else
                    {
                        break;
                    }
                }
                catch (Exception e)
                {
                    break;
                }
            }
            ois.close();
            System.out.println("DeSerialization success");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}

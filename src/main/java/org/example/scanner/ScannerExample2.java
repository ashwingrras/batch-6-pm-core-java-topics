package org.example.scanner;

import java.util.Scanner;

public class ScannerExample2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your age");
        if(sc.hasNextInt()) // 19.0
        {
            int intValue = sc.nextInt();
            System.out.println("entered value "+intValue);
        }
        else
        {
            System.out.println("please enter valid age in number");
            sc = new Scanner(System.in);
            System.out.println(sc.hasNextInt());
            if(sc.hasNextInt()) //
            {
                int intValue = sc.nextInt();
                System.out.println("entered value "+intValue);
            }
            else
            {
                System.out.println("please enter valid age in number");
            }
        }

        //double doubleValue = sc.nextDouble();
        System.out.println();
    }
}

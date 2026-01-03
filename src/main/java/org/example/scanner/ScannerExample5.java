package org.example.scanner;

import java.util.Scanner;

public class ScannerExample5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",");
        String value = scanner.next();
        System.out.println("value "+value);
        String value2 = scanner.next();
        System.out.println("value2 "+value2);
    }
}

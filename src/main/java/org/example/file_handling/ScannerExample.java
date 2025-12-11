package org.example.file_handling;

import java.util.Scanner;

public class ScannerExample
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name");
        String name = scanner.next();
        System.out.println("name "+name);
    }
}

package org.example.scanner;

import java.util.Scanner;

public class ScannerExample3
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hasNext : "+scanner.hasNext());
        int val1 = scanner.nextInt();
        System.out.println("val1 "+val1);
        System.out.println("hasNext : "+scanner.hasNext());
        int val2 = scanner.nextInt();
        System.out.println("val2 "+val2);


    }
}

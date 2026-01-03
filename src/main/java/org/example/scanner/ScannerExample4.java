package org.example.scanner;

import java.util.Scanner;

public class ScannerExample4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your atm pin");
        String samplePin = "3212";
        double userAccountBalance = 100000;
        double perDayLimit = 20000;
        boolean isWrongMaxAttempt = false;
        int maxAttempt = 3;
        int attempt = 0;
        while(scanner.hasNext())
        {
            String value = scanner.next();
            System.out.println("value "+value);
            if(value.equalsIgnoreCase(samplePin))
            {
                isWrongMaxAttempt = false;
                break;
            }
            attempt++;
            if(attempt < maxAttempt)
            {
                System.out.println("pin in wrong, please enter valid pin");
            }
            else
            {
                isWrongMaxAttempt = true;
                break;
            }
        }
        System.out.println("isWrongMaxAttempt "+isWrongMaxAttempt);
        if(isWrongMaxAttempt)
        {
            System.out.println("you entered wrong pin 3 times, your account blocked");
        }
        else
        {
            System.out.println("please enter amount to withdrawn");
            String amount = scanner.next();
            System.out.println("withdrawn amount as : "+amount);
        }
    }
}

package org.example.scanner;

import java.util.Scanner;

public class ScannerExample1
{
    public static void main(String[] args)
    {
        String userPin = "3212";
        System.out.println(" hello user ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your name");
        String name = scanner.next();
        System.out.println("please enter your age");
        int age = scanner.nextInt();
        System.out.println("please enter your mobileNo");
        String mobileNo = scanner.next();

        System.out.println("name "+name+", age "+age+", mobileNo "+mobileNo);
        System.out.println("please enter your pin");

        while(scanner.hasNext())
        {
            String pin = scanner.next();
            System.out.println("pin "+pin);
            if(pin.equalsIgnoreCase(userPin))
            {
                System.out.println("you entered correct pin");
                break;
            }
            System.out.println("please enter your pin again");
        }
    }
}

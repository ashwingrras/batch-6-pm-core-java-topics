package org.example.recursive_method;

public class FactorialExample {
    // Recursive method
    static int factorial(int num) {
        // Base case
        if (num == 0 || num == 1) {
            return 1;
        }
        // Recursive case
        return num * factorial(num - 1);
        /*
            return 1
            1 * 1 : 1
            1 * 2 : 2
            2 * 3 : 6
            6 * 4 : 24
            24 * 5 : 120



         */
    }

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("Factorial of 5 is: " + result);
    }
}


package org.example.control_statements;

public class Example3
{

    public static void main(String[] args) {
        int a = 14, b = 12, c = 15, d = 16;
        System.out.println("find the max and min");
        if (a > b && a > c && a > d) {
            System.out.println("a is max");
        }
        if (b > a && b > c && b > d) {
            System.out.println("b is max");
        }
        if (c > a && c > b && c > d) {
            System.out.println("c is max");
        }

        if (d > b && d > c) {
            System.out.println("d is max");
        }

        String secondmax="";


        System.out.println("find secondmax");
        if(a > b && a > d )
        {
            System.out.println("a is secondmax");
        } else if ( b > a && b > d) {
            System.out.println("b is secondmax");
        }
        if(d > a && d > b){
            System.out.println("d is secondmax");
        }


    }
}
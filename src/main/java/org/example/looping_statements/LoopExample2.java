package org.example.looping_statements;

public class LoopExample2
{
    public static void main(String[] args) {
        int i = 0;
        while( i < 5)
        {
            System.out.println(" i "+i); // 0, 1, 2, 3
            if(i == 3)
                break;
            i++;
        }
    }
}

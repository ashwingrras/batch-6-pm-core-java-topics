package org.example.multithreading;

import java.time.Instant;

// A, B, C, D, E
public class Thread2PrintAlphabet extends Thread
{
    @Override
    public void run() {
        System.out.println("Thread2PrintAlphabet 1 start " + Instant.now());
        for(int i = 97; i <= 122; i++)
        {
            System.out.print((char)i);
        }
        System.out.println();
        System.out.println("Thread2PrintAlphabet 1 end " + Instant.now());
    }
}

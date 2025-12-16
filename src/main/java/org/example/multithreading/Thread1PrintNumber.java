package org.example.multithreading;

import java.time.Instant;

public class Thread1PrintNumber extends Thread
{

    final String lock;

    Thread1PrintNumber(String lock)
    {
        this.lock = lock;
    }

    @Override
    public  void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread1PrintNumber "+threadName+" start " + Instant.now());
        // synchronized block
        synchronized(lock){
            for (int i = 1; i <= 100; i++) {
                System.out.print(i + ", ");
            }
            System.out.println();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread1PrintNumber "+threadName+" end " + Instant.now());
        }
    }
}

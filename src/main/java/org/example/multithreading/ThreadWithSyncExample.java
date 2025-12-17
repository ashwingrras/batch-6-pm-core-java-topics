package org.example.multithreading;

import java.time.Instant;

public class ThreadWithSyncExample implements Runnable{

    @Override
    public synchronized void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread1PrintNumber "+threadName+" start " + Instant.now());
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

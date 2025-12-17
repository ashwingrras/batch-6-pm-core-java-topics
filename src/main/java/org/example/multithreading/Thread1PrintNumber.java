package org.example.multithreading;

import java.time.Instant;

public class Thread1PrintNumber extends Thread
{

    final Object lock;

    public Counter counter;

    Thread1PrintNumber(Object lock, Counter counter)
    {
        this.lock = lock;
        this.counter = counter;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread1PrintNumber "+threadName+" start " + Instant.now());
        // synchronized block
        synchronized(lock){
            System.out.println("Thread1PrintNumber "+threadName+" synchronized start " + Instant.now());
            for (int i = 1; i <= 100; i++) {
                System.out.print(i + ", ");
            }
            System.out.println();
            System.out.println("before lock.wait");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("after lock.wait");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread1PrintNumber "+threadName+" end " + Instant.now());
        }
        //printNumbers();
        //counter.printNumbers();
    }

    public synchronized void printNumbers() {
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

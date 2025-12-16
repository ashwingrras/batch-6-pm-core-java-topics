package org.example.multithreading;

import java.time.Instant;

public class Thread3WithRunnable extends Exception implements Runnable{
    @Override
    public void run() {
        System.out.println("thread 3 with runnable start " + Instant.now());
        String[] names = {"akshiat","divyank","vipul","arpit"};
        for(int i =0; i <10000; i++)
        {
            ///System.out.println("inside thread 1 name: "+names[i]);
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("thread 3 with runnable end " + Instant.now());
    }
}

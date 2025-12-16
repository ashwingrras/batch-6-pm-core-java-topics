package org.example.multithreading;

/*
   Thread Life Cycle:
   1. New
   2. Start / Runnable -> Running
   3. Timed_Waiting
   3. Blocked
   4. Waiting
   5. Terminate





 */


import java.time.Instant;
import java.util.Date;

public class Thread1 extends Thread {

    public void run(){
        System.out.println("thread 1 start " + Instant.now());
        String[] names = {"akshiat","divyank","vipul","arpit"};
        for(int i =0; i <10000; i++)
        {
            ///System.out.println("inside thread 1 name: "+names[i]);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("thread 1 end " + Instant.now());
    }

}

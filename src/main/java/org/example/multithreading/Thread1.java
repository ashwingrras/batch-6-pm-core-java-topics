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


import java.util.Date;

public class Thread1 extends Thread {

    public void run(){
        System.out.println("thread 1 is running..." + new Date());
        String[] names = {"akshiat","divyank","vipul","arpit"};
        for(int i =0; i <names.length; i++)
        {
            System.out.println("inside thread 1 name: "+names[i]);
        }
    }

}

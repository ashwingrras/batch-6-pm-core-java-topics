package org.example.multithreading;

import java.time.Instant;
import java.util.Date;

/*
   thread1 : New  -> .start()  -> Runnable ->  Terminated

   thread1 : New  -> .start()  -> Runnable -> Thread.sleep() -> Timed_Waiting  Terminated



 */

public class MainClass1
{
    public static void main(String[] args)
    {
        // First way to create and run thread
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        //thread1.run();// this is not treat as thread, will work as normal method
        //System.out.println(thread1.getState());
        thread1.start();// this treat as thread
        thread2.start();// this treat as thread
        System.out.println("thread1 state "+thread1.getState());
        System.out.println("thread2 state "+thread2.getState());
        /*System.out.println("time before loop "+new Date());
        for(int i =1; i <=10; i++)
        {
            System.out.println("i "+i);
        }
        System.out.println("time after loop "+new Date());
        System.out.println(thread1.getState());*/
        try {
            System.out.println("before sleep "+ Instant.now());
            Thread.sleep(2000); // 2000 milliseconds = 2 second
            System.out.println("after sleep "+Instant.now());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("thread1 state "+thread1.getState());
        System.out.println("thread2 state "+thread2.getState());
    }
}

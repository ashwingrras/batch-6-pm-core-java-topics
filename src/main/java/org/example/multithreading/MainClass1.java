package org.example.multithreading;

import java.util.Date;

public class MainClass1
{
    public static void main(String[] args)
    {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        //System.out.println(thread1.getState());
        thread1.start();
        thread2.start();
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
        /*System.out.println("time before loop "+new Date());
        for(int i =1; i <=10; i++)
        {
            System.out.println("i "+i);
        }
        System.out.println("time after loop "+new Date());
        System.out.println(thread1.getState());*/
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
    }
}

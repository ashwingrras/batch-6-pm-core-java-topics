package org.example.multithreading;

import java.time.Instant;

public class MultiThreadExample extends Thread
{

    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("at MultiThreadExample run method, start "+threadName+", time : "+ Instant.now());
        for(int i=1;i<=5;i++){
            System.out.println(threadName + " i "+i);
        }
        System.out.println("at MultiThreadExample run method, end "+threadName+", time : "+ Instant.now());
    }
}

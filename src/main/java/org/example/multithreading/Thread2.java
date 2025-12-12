package org.example.multithreading;

import java.time.Instant;
import java.util.Date;

public class Thread2 extends Thread
{
    public void run(){
        System.out.println("thread 2 start " + Instant.now());
        String[] courses = {"dsa","java","python","web development"};
        for(int i =0; i <10000; i++)
        {
            //System.out.println("inside thread 2 course: "+courses[i]);
        }
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("thread 2 end " + Instant.now());
    }
}

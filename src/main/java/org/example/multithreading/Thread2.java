package org.example.multithreading;

import java.util.Date;

public class Thread2 extends Thread
{
    public void run(){
        System.out.println("thread 2 is running..." + new Date());
        String[] courses = {"dsa","java","python","web development"};
        for(int i =0; i <courses.length; i++)
        {
            System.out.println("inside thread 2 course: "+courses[i]);
        }
    }
}

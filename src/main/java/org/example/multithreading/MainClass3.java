package org.example.multithreading;

import java.time.Instant;

public class MainClass3
{
    public static void main(String[] args) {

        /*Thread threadOld = new Thread();
        threadOld.start();*/

        // Third way of create and run thread
        Thread thread = new Thread(() -> {
            // Thread logic
            System.out.println("thread with lambda start " + Instant.now());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println("thread state "+thread.getState());
        thread.start();
        System.out.println("thread state "+thread.getState());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("thread state "+thread.getState());
    }


    public static void testMethod()
    {
        System.out.println("inside testMethod");
    }

}

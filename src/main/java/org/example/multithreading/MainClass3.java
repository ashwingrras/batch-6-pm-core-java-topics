package org.example.multithreading;

import java.time.Instant;

public class MainClass3
{
    public static void main(String[] args) {
        // Third way of create and run thread
        Thread thread = new Thread(() -> {
            // Thread logic
            System.out.println("thread with lambda start " + Instant.now());
        });
        thread.start();
    }
}

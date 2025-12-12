package org.example.multithreading;

import java.time.Instant;

public class Thread3WithRunnable extends Exception implements Runnable{
    @Override
    public void run() {
        System.out.println("thread 3 with runnable start " + Instant.now());
    }
}

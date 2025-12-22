package org.example.multithreading;

public class Thread1Daemon extends Thread
{
    @Override
    public void run() {
        System.out.println(" at Thread1Daemon Start");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" at Thread1Daemon End");
    }
}

package org.example.multithreading;

public class Thread1NonDaemon extends Thread
{
    @Override
    public void run() {
        System.out.println(" at Thread1NonDaemon Start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" at Thread1NonDaemon End");
    }
}

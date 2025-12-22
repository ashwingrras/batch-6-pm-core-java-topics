package org.example.multithreading;

public class MainClassDaemon
{
    public static void main(String[] args) {
        Thread1NonDaemon thread1NonDaemon = new Thread1NonDaemon();
        Thread1Daemon thread1Daemon = new Thread1Daemon();
        thread1Daemon.setDaemon(true);
        thread1NonDaemon.start();
        thread1Daemon.start();
    }
}

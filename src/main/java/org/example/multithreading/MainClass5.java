package org.example.multithreading;

public class MainClass5
{

    public static void main(String[] args)
    {
        ThreadWithSyncExample threadWithSyncExample1 = new ThreadWithSyncExample();
        ThreadWithSyncExample threadWithSyncExample2 = new ThreadWithSyncExample();
        Thread thread1 = new Thread(threadWithSyncExample1);
        Thread thread2 = new Thread(threadWithSyncExample1);
        thread1.start();
        thread2.start();
    }
}

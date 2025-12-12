package org.example.multithreading;

public class MainClass2
{
    public static void main(String[] args)
    {
        // Second way to create and run thread
        Thread3WithRunnable withRunnable = new Thread3WithRunnable();
        Thread thread = new Thread(withRunnable);
        //withRunnable.run(); this is not treat as thread, will work as normal method
        thread.start(); // this treat as thread
    }
}

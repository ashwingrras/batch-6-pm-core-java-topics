package org.example.multithreading;

/*
    NEW -> RUNNABLE -> synchronized block -> Other Thread will BLOCKED

    Thread1   - Enter in synchronized block till other thread with same lock will Blocked
    Thread2   - BLOCKED till Thread1 not completed

 */

public class MainClass4
{
    public static void main(String[] args) {


        Object lock = new Object();
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Thread1PrintNumber thread1 =  new Thread1PrintNumber(lock, counter1);
        thread1.setName("11111");
        Thread1PrintNumber thread2 = new Thread1PrintNumber(lock, counter1);
        thread2.setName("22222");
        thread1.start();
        thread2.start();
        System.out.println("thread1 : "+thread1.getState());
        System.out.println("thread2 : "+thread2.getState());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //System.out.println("thread1 : "+thread1.getState());
        //System.out.println(thread2.getState());
        System.out.println("thread1 : "+thread1.getState());
        System.out.println("thread2 : "+thread2.getState());
        synchronized (lock)
        {
            //lock.notify();
            lock.notifyAll();
        }
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("thread1 : "+thread1.getState());
        System.out.println("thread2 : "+thread2.getState());
    }
}

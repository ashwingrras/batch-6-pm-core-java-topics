package org.example.multithreading;

public class SynchronizationDemo1
{
    public static void main(String[] args) {
        Bus b =new Bus(1);
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(b);
        t1.setName("keshav");
        t2.setName("ayush");
        t3.setName("kushal");

        t1.start();
        t2.start();
        t3.start();

    }
}

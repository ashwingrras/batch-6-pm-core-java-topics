package org.example.multithreading;

public class VolatileKeywordExample
{
    public static volatile boolean running = true;
    public static void main(String[] args)throws InterruptedException {
        VolatileDemo1 t1 = new VolatileDemo1();
        VolatileDemo2 t2 = new VolatileDemo2();
        t1.start();
        t2.start();
        //Thread.sleep(5000);
        //t1.changeVolatileValue();
    }
}


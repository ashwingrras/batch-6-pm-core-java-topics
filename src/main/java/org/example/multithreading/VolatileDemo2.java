package org.example.multithreading;

import static org.example.multithreading.VolatileKeywordExample.running;

public class VolatileDemo2  extends Thread
{
    public void run(){
        System.out.println("THREAD START");
        try {
            Thread.sleep(3000);
            running = false;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("THREAD END");
    }
}

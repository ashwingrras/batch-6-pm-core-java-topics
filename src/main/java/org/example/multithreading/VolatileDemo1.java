package org.example.multithreading;

import static org.example.multithreading.VolatileKeywordExample.running;

class VolatileDemo1 extends Thread {
    public void run(){
        System.out.println("THREAD START");
        while (running) {
            System.out.println("Running");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println("THREAD END");
    }
    // Here change value of volatile variable
    public void changeVolatileValue(){
        System.out.println("After calling shutdown function");
        running = false;
    }
}

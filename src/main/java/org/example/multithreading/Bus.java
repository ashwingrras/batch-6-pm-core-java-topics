package org.example.multithreading;

public class Bus implements Runnable{

    int available = 1;
    int passenger;
    Bus(int pass){
        this.passenger = pass;
    }
    @Override
    public synchronized  void run() {
        String name = Thread.currentThread().getName();
        if(available>=passenger) {
            System.out.println(name+" Reserved seat");
            available = available-passenger;
        }
        else {
            System.out.println(name+" sorry not Reserved seat");
        }
    }

}

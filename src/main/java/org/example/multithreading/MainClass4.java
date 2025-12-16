package org.example.multithreading;

public class MainClass4
{
    public static void main(String[] args) {



        Thread1PrintNumber thread1 =  new Thread1PrintNumber("1");
        thread1.setName("11111");
        Thread1PrintNumber thread2 = new Thread1PrintNumber("1");
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
        System.out.println("thread2 : "+thread2.getState());
    }
}

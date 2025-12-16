package org.example.multithreading;

public class MultiThreadMainClass
{
    public static void main(String[] args)
    {
        MultiThreadExample example1 = new MultiThreadExample();
        example1.setName("Akshita");
        MultiThreadExample example2 = new MultiThreadExample();
        example2.setName("Divyank");
        System.out.println("example1 state "+example1.getState());
        System.out.println("example2 state "+example2.getState());
        example1.start();
        example2.start();
        System.out.println("example1 state "+example1.getState());
        System.out.println("example2 state "+example2.getState());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("example1 state "+example1.getState());

    }
}

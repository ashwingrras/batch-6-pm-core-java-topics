package org.example.multithreading;

class ThreadDemo1 extends Thread{
    private String name1 = "All Product";
    private String name2 = "Wishlist";
   public void run(){
       System.out.println("start thread1 first sync");
       synchronized(name1){
        System.out.println("Thread 1 holding name1 : " +name1);
        try
        {
            //Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
           System.out.println("thread1 second sync");
        synchronized(name2)
        {
            System.out.println("Thread 1 holding name2 : " +name2);
        }
           System.out.println("end thread1");
        //
       }
       //
   }
}
class ThreadDemo2 extends Thread{
    private String name1 = "All Product";
    private String name2 = "Wishlist";
   public void run(){
       System.out.println("start thread2 first sync");
       synchronized(name2)
       { // name1
        System.out.println("Thread 2 holding name1 : " +name2);
        try
        {
            //Thread.sleep(500);
        } catch (Exception e) {
            // TODO: handle exception
        }
           System.out.println("thread2 second sync");
        synchronized(name1)
        { // name2
            System.out.println("Thread 2 holding name2 : " +name1);
        }
           System.out.println("end thread2");
       }
   }
}
public class DeadlockDemo {
   
    public static void main(String[] args) 
    {

        ThreadDemo1 d1  = new ThreadDemo1();
        ThreadDemo2 d2  = new ThreadDemo2();
        d1.start();
        try {
            //Thread.sleep(1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        d2.start();
    }
}
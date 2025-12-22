package org.example.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    Thread state:
    1. NEW
    2. RUNNABLE
    3. TIMED_WAITING : sleep(1000)
    4. BLOCKED :  Object lock (akshita)
    5. WAITING : Object lock (akshita)
        lock.wait() infinite time, notify ( single ) notifyAll ( all waiting thread)
    6. TERMINATED

    Deadlock:    1. p1
                 2. p2
                         a - b
                         a - b
                         a - b
                 1. p2
                 2. p1


 */
public class ThreadPoolExample1
{
    public static void main(String[] args) {
        // Create a thread pool with 1 threads
        ExecutorService executor = Executors.newFixedThreadPool(20);

        // Submit 5 tasks to the thread pool
        for (int i = 1; i <= 100; i++)
        {
            WorkerTask task = new WorkerTask(i);
            executor.submit(task);
        }
        // Shut down the executor
        executor.shutdown();
    }
}

class WorkerTask implements Runnable {
    private final int taskId;

    public WorkerTask(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run()
    {
        System.out.println("Task " + taskId + " is START on thread " + Thread.currentThread().getName());
        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Task " + taskId + " COMPLETE on thread " + Thread.currentThread().getName());
    }
}


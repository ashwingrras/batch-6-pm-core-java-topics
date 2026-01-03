package org.example.collection_framework;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class ArrayDequeExample1
{
    public static void main(String[] args)
    {
        Queue<String> queue = new LinkedBlockingQueue<>(4);
        queue.add("A1");
        queue.add("a");
        queue.add("C");
        queue.add("d");
        queue.add("E");
        queue.add("A2");
        System.out.println("queue "+queue);
        queue.remove();
        System.out.println("queue "+queue);
        queue.add("D");
        System.out.println("queue "+queue);
        System.out.println(queue.peek());
        System.out.println("queue "+queue);
        System.out.println(queue.poll());
        System.out.println("queue "+queue);
        System.out.println(queue.offer("d"));
        System.out.println("queue "+queue);
    }
}

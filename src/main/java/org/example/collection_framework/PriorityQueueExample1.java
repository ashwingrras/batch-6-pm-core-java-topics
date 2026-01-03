package org.example.collection_framework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample1
{
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("A");
        queue.add("a");
        queue.add("C");
        queue.add("d");
        queue.add("E");
        System.out.println("queue "+queue);
        queue.remove();
        System.out.println("queue "+queue);
        queue.add("D");
        System.out.println("queue "+queue);
        queue.remove();
        System.out.println("queue "+queue);
        queue.remove();
        System.out.println("queue "+queue);
        System.out.println(queue.peek());
        System.out.println("queue "+queue);
        System.out.println(queue.poll());
        System.out.println("queue "+queue);
        System.out.println(queue.offer("g"));
        System.out.println("queue "+queue);
    }
}

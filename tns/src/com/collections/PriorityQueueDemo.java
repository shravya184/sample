package com.collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(40);
        pq.add(20);
        pq.add(30);
        pq.add(10);

        System.out.println("PriorityQueue elements (heap order when polled): " + pq);
        System.out.println("Head element (peek): " + pq.peek());

        pq.poll(); // removes head (smallest)
        System.out.println("After removing head: " + pq);
    }
}

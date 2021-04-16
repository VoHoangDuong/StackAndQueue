package com.queue.demo;

public class LinkedListQueueClient {
    public static void main(String[] args) {
            MyLinkedListQueue<Integer> queue = new MyLinkedListQueue<>();
            queue.enqueue(10);
            queue.enqueue(20);
            queue.dequeue();
            queue.dequeue();
            queue.enqueue(30);
            queue.enqueue(40);
            queue.enqueue(50);
        System.out.println(queue.dequeue().key);
        }
    }

package com.queueinterface.reversequeue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        //create queue
        Queue<Integer> queue = new LinkedList<>();
        //add
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        //display the result
        System.out.println("Original queue: " + queue);
        System.out.println("Reversed queue: " + ReverseQueue.reverseQueue(queue));
    }
}

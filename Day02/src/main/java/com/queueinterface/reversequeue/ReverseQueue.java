package com.queueinterface.reversequeue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    //method to reverse a queue
    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {

        //create a stack
        Stack<Integer> stack = new Stack<Integer>();

        //dequeue the queue and add element on the stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        //remove from the stack and add to queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        //return reversed queue
        return queue;
    }

}

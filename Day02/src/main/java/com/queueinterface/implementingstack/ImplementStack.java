package com.queueinterface.implementingstack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStack {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public ImplementStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Push element onto stack
    public void push(int x) {
        q1.add(x);
    }

    // Removes the top element of the stack
    public int pop() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        // Move all elements except the last from q1 to q2
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        // Get the last element
        int topElement = q1.poll();

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    // Get the top element
    public int top() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        // Move all elements except the last from q1 to q2
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        // Get the last element (but do not remove it)
        int topElement = q1.poll();
        q2.add(topElement);

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }
}
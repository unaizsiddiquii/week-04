package com.queueinterface.circularbuffersimulation;

import java.util.LinkedList;

public class CircularBuffer<T> {
    private final int capacity;
    private final LinkedList<T> buffer;

    public CircularBuffer(int size) {

        //size to limit linked list
        this.capacity = size;
        this.buffer = new LinkedList<>();
    }

    public void add(T item) {
        if (buffer.size() == capacity) {
            // Remove oldest element
            buffer.removeFirst();
        }
        buffer.add(item);
    }

    public void display() {
        System.out.println("Buffer: " + buffer);
    }
}

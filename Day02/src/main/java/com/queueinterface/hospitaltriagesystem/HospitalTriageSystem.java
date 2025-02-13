package com.queueinterface.hospitaltriagesystem;

import java.util.LinkedList;

public class HospitalTriageSystem<T> {
    private final int capacity;
    private final LinkedList<T> buffer;

    public HospitalTriageSystem(int size) {

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

package com.queueinterface.circularbuffersimulation;

public class Main {
    public static void main(String[] args) {
        CircularBuffer<Integer> cb = new CircularBuffer<>(3);
        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.display();
        cb.add(4);
        cb.display();
    }
}

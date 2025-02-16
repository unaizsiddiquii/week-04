package com.listinterface.nthelement;


public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 3;
        System.out.println("Nth element from end: " + list.findNthFromEnd(n)); // Output: D
    }
}

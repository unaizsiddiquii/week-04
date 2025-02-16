package com.listinterface.reverselist;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class LinkedL {
    Node head;
    Node tail;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void display() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Function to reverse the singly linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current;      // Move prev to current
            current = next;      // Move current to next node
        }
        head = prev; // Update head to last processed node

    }
}
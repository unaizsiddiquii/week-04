package com.nthelement;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Function to find Nth node from end
    public String findNthFromEnd(int n) {
        Node first = head, second = head;

        for (int i = 0; i < n; i++) {

            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }


        return second.data;
    }

    // Function to add a node
    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
}
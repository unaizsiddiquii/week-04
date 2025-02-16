package com.queueinterface.implementingstack;

public class Main {
    public static void main(String[] args) {
        ImplementStack stack = new ImplementStack();

        //add
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //display
        System.out.print(stack.pop() + " "); // Output: 3
        System.out.print(stack.top() + " "); // Output: 2
        System.out.print(stack.pop() + " "); // Output: 2
        System.out.println(stack.isEmpty()); // Output: false
    }
}

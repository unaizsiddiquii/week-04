package com.listinterface.reverselist;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //object of reverse class
        Reverse reverse = new Reverse();

        //create array list
        System.out.println("Array List  --- ");
        ArrayList<Integer> list = new ArrayList<>();

        //add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //display the result
        System.out.println("Orignal : " + list);
        System.out.println("reverse : " + reverse.reverseArrayList(list));

        //linked list operation
        System.out.println("LinkedList  --- ");

        //linked list object (implemented linkedlist)
        LinkedL ll = new LinkedL();
        ll.add(8);
        ll.add(6);
        ll.add(9);
        ll.add(11);
        ll.add(2);

        //printing result
        System.out.print("Orignal : ");
        ll.display();
        System.out.println();
        ll.reverse();
        System.out.print("reverse : ");
        ll.display();


    }
}

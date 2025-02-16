package com;

import java.util.List;

//list Manager class
public class ListManager {

    //    method to add element in the list
    public static List<Integer> addElement(List<Integer> list, int element) {
        list.add(element);
        return list;
    }

    //    method to return element in the list
    public static List<Integer> removeElement(List<Integer> list, int element) {
        list.remove(element);
        return list;
    }

    //    method to get the size of list
    public static int getSize(List<Integer> list) {

        return list.size();
    }

    public static void main(String[] args) {

    }
}

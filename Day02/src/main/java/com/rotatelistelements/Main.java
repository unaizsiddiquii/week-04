package com.rotatelistelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        RotateListElements rotateListElements = new RotateListElements();
        List<Integer> result = rotateListElements.rotateElements(list, 2);
        System.out.println(result);
    }
}

package com.setsinterface.settosortedlist;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(3);
        set.add(2);
        set.add(5);
        set.add(1);
        set.add(67);
        set.add(9);
        set.add(7);

        SetConverter converter = new SetConverter();

        System.out.println("Set : " + set);
        System.out.println("Sorted List : " + converter.convert(set));

    }
}

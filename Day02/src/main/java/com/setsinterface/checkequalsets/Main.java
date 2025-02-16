package com.setsinterface.checkequalsets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        EqualSetChecker checker = new EqualSetChecker();
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);
        System.out.println(checker.equalSets(set1, set2));

    }
}

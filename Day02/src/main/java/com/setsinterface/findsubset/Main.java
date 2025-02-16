package com.setsinterface.findsubset;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SubSet subSet = new SubSet();
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        //adding values in set1
        set1.add(2);
        set1.add(4);

        //adding values in set2
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);


        System.out.println("set 1 is subset of set2 : " + subSet.isSubset(set1, set2));

    }
}

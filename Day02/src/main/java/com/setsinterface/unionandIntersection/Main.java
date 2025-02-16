package com.setsinterface.unionandIntersection;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Adding elements to sets1
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Adding elements to sets2
        set2.add(3);
        set2.add(4);
        set2.add(5);

        //object of UnionAndIntersectionFinder class
        UnionAndIntersectionFinder finder = new UnionAndIntersectionFinder();

        //union
        System.out.println("Union :  " + finder.getUnion(set1, set2));
        //intersection
        System.out.println("Intersection :  " + finder.getIntersection(set1, set2));

    }
}

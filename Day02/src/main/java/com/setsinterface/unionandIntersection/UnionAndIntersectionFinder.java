package com.setsinterface.unionandIntersection;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersectionFinder {
    public Set<Integer> getUnion(Set<Integer> set1, Set<Integer> set2) {
        // Union
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        return unionSet;

    }

    public Set<Integer> getIntersection(Set<Integer> set1, Set<Integer> set2) {
        // Intersection
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);

        return intersectionSet;
    }
}

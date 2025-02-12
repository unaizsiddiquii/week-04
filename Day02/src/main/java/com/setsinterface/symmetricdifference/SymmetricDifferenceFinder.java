package com.setsinterface.symmetricdifference;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifferenceFinder {

    //method
    public Set<Integer> findSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {

        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2); // Union of both sets

        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2); // Intersection of both sets

        // Symmetric Difference = Union - Intersection
        unionSet.removeAll(intersectionSet);

        return unionSet;


    }
}

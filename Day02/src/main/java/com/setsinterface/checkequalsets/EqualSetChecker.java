package com.setsinterface.checkequalsets;

import java.util.Set;

public class EqualSetChecker {

    public boolean equalSets(Set<Integer> a, Set<Integer> b) {
        if (a.size() != b.size()) {
            return false;
        }

        for (Integer i : a) {
            if (!b.contains(i)) {
                return false;
            }
        }
        return true;

    }
}

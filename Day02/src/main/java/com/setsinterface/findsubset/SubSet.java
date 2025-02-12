package com.setsinterface.findsubset;

import java.util.Set;

public class SubSet {

    //method to find sub set
    public boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        for (Integer num : set1) {
            if (!set2.contains(num)) {
                //is it's not contain
                return false;
            }
        }
        //return true it is contain
        return true;
    }
}

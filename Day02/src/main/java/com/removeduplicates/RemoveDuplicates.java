package com.removeduplicates;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(List<Integer> list) {
        List<Integer> uniqueList = new ArrayList<>();

        for (Integer num : list) {
            if (!uniqueList.contains(num)) { // Check if the number is already present
                uniqueList.add(num);
            }
        }
        return uniqueList;
    }

}

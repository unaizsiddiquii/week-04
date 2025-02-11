package com.rotatelistelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateListElements {
    public List<Integer> rotateElements(List<Integer> list, int positions) {

        int size = list.size();
        if (size == 0) return list; // Handle empty list

        positions = positions % size; // Handle large rotations

        // Split and rearrange the list
        List<Integer> rotatedList = new ArrayList<>();
        rotatedList.addAll(list.subList(positions, size)); // Add second part
        rotatedList.addAll(list.subList(0, positions)); // Add first part

        return rotatedList;

    }
}

package com.listinterface.reverselist;

import java.util.ArrayList;

//reverse class
public class Reverse {
    //method to reverse arrayList
    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> list) {
        // Reverse using two-pointer approach
        int left = 0, right = list.size() - 1;
        while (left < right) {
            // Swap elements
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }

        return list;
    }

}

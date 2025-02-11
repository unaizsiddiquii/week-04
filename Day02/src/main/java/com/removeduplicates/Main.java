package com.removeduplicates;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        RemoveDuplicates rd = new RemoveDuplicates();
        List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println("Original List: " + numbers);

        List<Integer> uniqueNumbers = rd.removeDuplicates(numbers);
        System.out.println("List after removing duplicates: " + uniqueNumbers);
    }
}

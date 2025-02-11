package com.frequencyofelements;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //list which store fruits
        List<String> fruitList = Arrays.asList("apple", "banana", "apple", "orange");

        //object of FruitFrequency class
        FruitFrequency fruitFrequency = new FruitFrequency();

        //create map and sore the return result
        Map<String, Integer> map = fruitFrequency.findFruitFrequency(fruitList);

        //display the result
        System.out.println(map);


    }
}

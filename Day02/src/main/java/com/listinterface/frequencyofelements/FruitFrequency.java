package com.listinterface.frequencyofelements;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FruitFrequency {

    public Map<String, Integer> findFruitFrequency(List<String> list) {

        Map<String, Integer> fruitFrequencyMap = new HashMap<>();

        for (String fruit : list) {
            fruitFrequencyMap.put(fruit, fruitFrequencyMap.getOrDefault(fruit, 0) + 1);
        }
        return fruitFrequencyMap;

    }
}

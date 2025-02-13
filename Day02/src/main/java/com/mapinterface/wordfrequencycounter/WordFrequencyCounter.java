package com.mapinterface.wordfrequencycounter;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    public static Map<String, Integer> wordFrequencyCounter(String text) {
        // Normalize the text: convert to lowercase and remove punctuation
        String normalizedText = text.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();

        // Split the text into words
        String[] words = normalizedText.split("\\s+");

        // Use a HashMap to count word frequencies
        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        return wordFrequencyMap;
    }
}

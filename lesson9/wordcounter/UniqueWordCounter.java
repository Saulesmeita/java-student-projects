package lv.javaguru.lesson9.wordcounter;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {

    private HashMap<String, Integer> words = new HashMap<>();

    void addWord(String word) {
        if (words.containsKey(word)) {
            int count = words.get(word);
            words.put(word, ++count);
        } else {
            words.put(word, 1);
        }
    }
    int getMostFrequentWord() {

        int maxValue = 1;
        for(Map.Entry<String, Integer> entry: words.entrySet()) {
            if (entry.getValue() >= maxValue) {
                maxValue = entry.getValue();
            }
        }
        return maxValue;
    }
    void printWordsFrequency() {
        for(Map.Entry<String, Integer> entry: words.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}

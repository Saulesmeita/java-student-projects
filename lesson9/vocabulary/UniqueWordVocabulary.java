package lv.javaguru.lesson9.vocabulary;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {

    private Set<String> vocabulary = new HashSet<>();

    public void addWord(String word) {
        if (word.isEmpty()) {
            System.out.println("Cannot add an empty word to the vocabulary");
        } else vocabulary.add(word);
    }

    public int getWordsCount() {
        return vocabulary.size();
    }

    public void printVocabulary() {
        System.out.println(vocabulary);
    }

    public String vocabularyContents() {
        return vocabulary.toString();
    }

    public boolean isInVocabulary(String word) {
        return vocabulary.contains(word);
    }
}

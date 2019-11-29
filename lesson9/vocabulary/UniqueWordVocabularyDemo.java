package lv.javaguru.lesson9.vocabulary;

public class UniqueWordVocabularyDemo {

    public static void main(String[] args) {

        UniqueWordVocabulary lexicon = new UniqueWordVocabulary();

        lexicon.addWord("");
        lexicon.addWord("The");
        lexicon.addWord("test");
        lexicon.addWord("of");
        lexicon.addWord("the");
        lexicon.addWord("hash");
        lexicon.addWord("set");
        lexicon.addWord("collection");

        lexicon.printVocabulary();
        System.out.println("The vocabulary contains " + lexicon.getWordsCount() + " elements");

        lexicon.addWord("The");
        lexicon.addWord("hash");
        lexicon.addWord("set");
        lexicon.addWord("collection");
        lexicon.addWord("stores only unique elements");

        lexicon.printVocabulary();
        System.out.println("The vocabulary contains " + lexicon.getWordsCount() + " elements");
    }
}

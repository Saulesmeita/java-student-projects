package lv.javaguru.lesson9.wordcounter;

public class UniqueWordCounterDemo {

    public static void main(String[] args) {

        UniqueWordCounter counter = new UniqueWordCounter();
        counter.addWord("One");
        counter.addWord("Two");
        counter.addWord("Three");
        counter.addWord("Two");
        counter.addWord("Three");
        counter.addWord("Three");

        System.out.println(counter.getMostFrequentWord());
        counter.printWordsFrequency();
    }
}

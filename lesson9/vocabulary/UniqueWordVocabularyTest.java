package lv.javaguru.lesson9.vocabulary;

public class UniqueWordVocabularyTest {

    private void checkEquivalence(int actualResult, int expectedResult, String testDescription) {

        if (actualResult == expectedResult) {
            System.out.println(testDescription + " test has passed.");
        } else {
            System.out.println(testDescription + " test has failed:");
            System.out.println("Expected '" + expectedResult + "', but was '" + actualResult + "'.");
        }
    }

    private void checkEquivalence(String actualResult, String expectedResult, String testDescription) {

        if (actualResult.equals(expectedResult)) {
            System.out.println(testDescription + " test has passed.");
        } else {
            System.out.println(testDescription + " test has failed:");
            System.out.println("Expected '" + expectedResult + "', but was '" + actualResult + "'.");
        }
    }
    private void checkEquivalence(boolean actualResult, boolean expectedResult, String testDescription) {

        if (actualResult == expectedResult) {
            System.out.println(testDescription + " test has passed.");
        } else {
            System.out.println(testDescription + " test has failed:");
            System.out.println("Expected '" + expectedResult + "', but was '" + actualResult + "'.");
        }
    }

    private void test1() {

        UniqueWordVocabulary victim = new UniqueWordVocabulary();
        checkEquivalence(victim.getWordsCount(),0, "Immediately after creation the set is empty");
        checkEquivalence(victim.vocabularyContents(), "[]", "Immediately after creation the set is empty");
        victim.addWord("");
        checkEquivalence(victim.getWordsCount(), 0, "Empty word addition is impossible");
        victim.addWord("word1");
        checkEquivalence(victim.getWordsCount(),1, "Unique word addition");
        checkEquivalence(victim.vocabularyContents(), "[word1]", "Unique word addition");
        victim.addWord("word2");
        victim.addWord("word3");
        victim.addWord("word4");
        victim.addWord("word5");
        checkEquivalence(victim.getWordsCount(),5, "All unique words are being stored in the vocabulary");
        victim.addWord("word3");
        victim.addWord("word4");
        victim.addWord("word5");
        checkEquivalence(victim.getWordsCount(),5, "Non-unique words are not being stored in the vocabulary");
        checkEquivalence(victim.isInVocabulary("word1"), true, "All unique words are being stored in the vocabulary");
        checkEquivalence(victim.isInVocabulary("word2"), true, "All unique words are being stored in the vocabulary");
        checkEquivalence(victim.isInVocabulary("word5"), true, "All unique words are being stored in the vocabulary");
        checkEquivalence(victim.isInVocabulary("word0"), false, "The vocabulary contains only the words we added");
        checkEquivalence(victim.isInVocabulary("word"), false, "The vocabulary contains only the words we added");
    }

    public static void main(String[] args) {

        UniqueWordVocabularyTest test1 = new UniqueWordVocabularyTest();
        test1.test1();

    }
}

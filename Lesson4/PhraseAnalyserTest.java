package lv.javaguru.lesson4;

public class PhraseAnalyserTest {

    public void checkEquivalence(String actualResult, String expectedResult, String testDescription) {

        if (actualResult.equals(expectedResult)) {
            System.out.println(testDescription + " test has passed.");
        } else {
            System.out.println(testDescription + " test has failed:");
            System.out.println("Expected '" + expectedResult + "', but was '" + actualResult + "'.");
        }
    }

    public void test1() {

        final String FIRST = "Make";
        final String LAST = "great again";

        final String REZ1 = "It stands no chance";
        final String REZ2 = "It could be worse";
        final String REZ3 = "It is fine, really";

        final String CRITERIA_AND = "If the string starts with \"" + FIRST + "\"" + " AND ends with \"" + LAST + "\"" +
                ", the program has to return \"" + REZ1 + "\"";
        final String CRITERIA_OR = "If the string starts with \"" + FIRST + "\"" + " OR ends with \"" + LAST + "\"" +
                ", the program has to return \"" + REZ2 + "\"";
        final String CRITERIA_NONE = "If the string does not start with \"" + FIRST + "\"" + " and does not end with \"" + LAST + "\"" +
                ", the program has to return \"" + REZ3 + "\"";

        PhraseAnalyser victim = new PhraseAnalyser();

        checkEquivalence(victim.analyse("Make the life great again"),REZ1,CRITERIA_AND);
        checkEquivalence(victim.analyse("Make the weather in Africa great again"),REZ1,CRITERIA_AND);
        checkEquivalence(victim.analyse("Make me some coffee, please"),REZ2,CRITERIA_OR);
        checkEquivalence(victim.analyse("The city looks great again"),REZ2,CRITERIA_OR);
        checkEquivalence(victim.analyse("The weather is fine, isn't it?"),REZ3,CRITERIA_NONE);

    }

    public static void main(String[] args) {

        PhraseAnalyserTest testOne = new PhraseAnalyserTest();
        testOne.test1();
    }
}

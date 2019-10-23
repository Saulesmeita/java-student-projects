package lv.javaguru.lesson4;

public class SignComparatorTest {

    public void checkEquivalence(String actualResult, String expectedResult, String testDescription) {

        if (actualResult.equals(expectedResult)) {
            System.out.println(testDescription + " test has passed.");
        } else {
            System.out.println(testDescription + " test has failed:");
            System.out.println("Expected '" + expectedResult + "', but was '" + actualResult + "'.");
        }
    }

    public void test1() {
        
        final String ZERO = "Number is equal to zero";
        final String NEGATIVE = "Number is negative";
        final String POSITIVE = "Number is positive";
        
        final String CHECK_POSITIVE = "Positive numbers return positive sign";
        final String CHECK_NEGATIVE = "Negative numbers return negative sign";
        final String CHECK_ZERO = "Zero returns Zero";
        
        SignComparator victim = new SignComparator();
        
        checkEquivalence(victim.compare(-5), NEGATIVE, CHECK_NEGATIVE);
        checkEquivalence(victim.compare(-100000), NEGATIVE, CHECK_NEGATIVE);
        checkEquivalence(victim.compare(2), POSITIVE, CHECK_POSITIVE);
        checkEquivalence(victim.compare(20000000), POSITIVE, CHECK_POSITIVE);
        checkEquivalence(victim.compare(0), ZERO, CHECK_ZERO);
    }

    public static void main(String[] args) {

        SignComparatorTest testOne = new SignComparatorTest();
        testOne.test1();
    }
}

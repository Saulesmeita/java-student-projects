package lv.javaguru.lesson4;

public class LightColorDetectorTest {

    public void checkEquivalence(String actualResult, String expectedResult, String testDescription) {

        if (actualResult.equals(expectedResult)) {
            System.out.println(testDescription + " test has passed.");
        } else {
            System.out.println(testDescription + " test has failed:");
            System.out.println("Expected '" + expectedResult + "', but was '" + actualResult + "'.");
        }
    }

    public void test1() {

        final String VIOLET = "Violet";
        final String BLUE = "Blue";
        final String GREEN = "Green";
        final String YELLOW = "Yellow";
        final String ORANGE = "Orange";
        final String RED = "Red";
        final String INVISIBLE = "Invisible Light";

        final String TEST_VIOLET = "Wave lengths from 380 to 449 give Violet";
        final String TEST_BLUE = "Wave lengths from 450 to 494 give Blue";
        final String TEST_GREEN = "Wave lengths from 495 to 569 give Green";
        final String TEST_YELLOW = "Wave lengths from 570 to 589 give Yellow";
        final String TEST_ORANGE = "Wave lengths from 590 to 619 give Orange";
        final String TEST_RED = "Wave lengths from 620 to 750 give Red";
        final String TEST_INVISIBLE = "Wave lengths < 380 and > 750 give Invisible Light";

        LightColorDetector victim = new LightColorDetector();

        checkEquivalence(victim.detect(380), VIOLET, TEST_VIOLET);
        checkEquivalence(victim.detect(449), VIOLET, TEST_VIOLET);
        checkEquivalence(victim.detect(400), VIOLET, TEST_VIOLET);
        checkEquivalence(victim.detect(450), BLUE, TEST_BLUE);
        checkEquivalence(victim.detect(494), BLUE, TEST_BLUE);
        checkEquivalence(victim.detect(455), BLUE, TEST_BLUE);
        checkEquivalence(victim.detect(495), GREEN, TEST_GREEN);
        checkEquivalence(victim.detect(569), GREEN, TEST_GREEN);
        checkEquivalence(victim.detect(550), GREEN, TEST_GREEN);
        checkEquivalence(victim.detect(570), YELLOW, TEST_YELLOW);
        checkEquivalence(victim.detect(589), YELLOW, TEST_YELLOW);
        checkEquivalence(victim.detect(577), YELLOW, TEST_YELLOW);
        checkEquivalence(victim.detect(590), ORANGE, TEST_ORANGE);
        checkEquivalence(victim.detect(619), ORANGE, TEST_ORANGE);
        checkEquivalence(victim.detect(599), ORANGE, TEST_ORANGE);
        checkEquivalence(victim.detect(620), RED, TEST_RED);
        checkEquivalence(victim.detect(750), RED, TEST_RED);
        checkEquivalence(victim.detect(700), RED, TEST_RED);
        checkEquivalence(victim.detect(800), INVISIBLE, TEST_INVISIBLE);
        checkEquivalence(victim.detect(379), INVISIBLE, TEST_INVISIBLE);
    }

    public static void main(String[] args) {

        LightColorDetectorTest testOne = new LightColorDetectorTest();
        testOne.test1();
    }
}

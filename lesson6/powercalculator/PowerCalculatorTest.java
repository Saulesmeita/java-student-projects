package lv.javaguru.lesson6.powercalculator;

public class PowerCalculatorTest {
    
    public void checkEquivalence(double actualResult, double expectedResult, String testDescription) {

        if (actualResult == expectedResult) {
            System.out.println(" Тест '" + testDescription + "'" + " прошёл успешно.");
        } else {
            System.out.println(" Тест '" + testDescription + "'" + " с треском провалился:");
            System.out.println("ожидаемый результат: '" + expectedResult + "', реальный результат: '" + actualResult + "'.");
        }
    }
    
    public void test1 () {

        final String POWER_OF_ZERO = "Возведение нуля в любую степень даёт нуль";
        final String POWER_OF_ONE = "Возведение единицы в любую ненулевую степень даёт единицу";
        final String POWER_IS_ONE = "Возведение любого числа в первую степень даёт само число";
        final String POWER_IS_MINUS_ONE = "Возведение любого числа X в минус первую степень даёт 1/X";
        final String ODD_POWER_OF_MINUS_ONE = "Возведение -1 в нечётную (ненулевую) степень даёт -1";
        final String EVEN_POWER_OF_MINUS_ONE = "Возведение -1 в чётную (ненулевую) степень даёт 1";
        final String POWER_IS_ZERO = "Возведение любого числа в нулевую степень даёт единицу";
        final String POSITIVE_INT_NUMBER_POSITIVE_POWER = "Возведение положительного целого числа в положительную степень";
        final String POSITIVE_FRACTIONAL_NUMBER_POSITIVE_POWER = "Возведение положительного дробного числа в положительную степень";
        final String POSITIVE_INT_NUMBER_NEGATIVE_POWER ="Возведение положительного целого числа в отрицательную степень";
        final String POSITIVE_FRACTIONAL_NUMBER_NEGATIVE_POWER = "Возведение положительного дробного числа в отрицательную степень";
        final String NEGATIVE_INT_NUMBER_POSITIVE_POWER = "Возведение отрицательного целого числа в положительную степень";
        final String NEGATIVE_FRACTIONAL_NUMBER_POSITIVE_POWER = "Возведение отрицательного дробного числа в положительную степень";
        final String NEGATIVE_INT_NUMBER_NEGATIVE_POWER = "Возведение отрицательного целого числа в отрицательную степень";
        final String NEGATIVE_FRACTIONAL_NUMBER_NEGATIVE_POWER = "Возведение отрицательного дробного числа в отрицательную степень";


        PowerCalculator victim = new PowerCalculator();

        checkEquivalence(victim.powerCalc(0,9), 0, POWER_OF_ZERO); // 0
        checkEquivalence(victim.powerCalc(0,1), 0, POWER_OF_ZERO); // 0
        checkEquivalence(victim.powerCalc(0,-3), 0, POWER_OF_ZERO); // 0
        checkEquivalence(victim.powerCalc(1,1), 1, POWER_OF_ONE); // 1
        checkEquivalence(victim.powerCalc(1,21), 1, POWER_OF_ONE); // 1
        checkEquivalence(victim.powerCalc(1,-3), 1, POWER_OF_ONE); // 1
        checkEquivalence(victim.powerCalc(1,-1), 1, POWER_OF_ONE); // 1
        checkEquivalence(victim.powerCalc(-1,1), -1, ODD_POWER_OF_MINUS_ONE); // -1
        checkEquivalence(victim.powerCalc(-1,3), -1, ODD_POWER_OF_MINUS_ONE); // -1
        checkEquivalence(victim.powerCalc(-1,2), 1, EVEN_POWER_OF_MINUS_ONE); // 1
        checkEquivalence(victim.powerCalc(-1,100), 1, EVEN_POWER_OF_MINUS_ONE); // 1
        checkEquivalence(victim.powerCalc(7,0), 1, POWER_IS_ZERO); // 1
        checkEquivalence(victim.powerCalc(0.8,0), 1, POWER_IS_ZERO); // 1
        checkEquivalence(victim.powerCalc(-3,0), 1, POWER_IS_ZERO); // 1
        checkEquivalence(victim.powerCalc(-0.15,0), 1, POWER_IS_ZERO); // 1
        checkEquivalence(victim.powerCalc(7,1), 7, POWER_IS_ONE);
        checkEquivalence(victim.powerCalc(0.8,1), 0.8, POWER_IS_ONE);
        checkEquivalence(victim.powerCalc(-3,1), -3, POWER_IS_ONE);
        checkEquivalence(victim.powerCalc(-0.15,1), -0.15, POWER_IS_ONE);
        checkEquivalence(victim.powerCalc(2,-1), 0.5, POWER_IS_MINUS_ONE);
        checkEquivalence(victim.powerCalc(0.5,-1), 2, POWER_IS_MINUS_ONE);
        checkEquivalence(victim.powerCalc(-4,-1), -0.25, POWER_IS_MINUS_ONE);
        checkEquivalence(victim.powerCalc(-0.25,-1), -4, POWER_IS_MINUS_ONE);
        checkEquivalence(victim.powerCalc(2,10), 1024, POSITIVE_INT_NUMBER_POSITIVE_POWER);
        checkEquivalence(victim.powerCalc(-2,10), 1024, NEGATIVE_INT_NUMBER_POSITIVE_POWER);
        checkEquivalence(victim.powerCalc(-3,3), -27, NEGATIVE_INT_NUMBER_POSITIVE_POWER);
        checkEquivalence(victim.powerCalc(2,-2), 0.25, POSITIVE_INT_NUMBER_NEGATIVE_POWER);
        checkEquivalence(victim.powerCalc(-2,-2), 0.25, NEGATIVE_INT_NUMBER_NEGATIVE_POWER);
        checkEquivalence(victim.powerCalc(-2,-3), -0.125, NEGATIVE_INT_NUMBER_NEGATIVE_POWER);
        checkEquivalence(victim.powerCalc(0.5,1), 0.5, POSITIVE_FRACTIONAL_NUMBER_POSITIVE_POWER);
        checkEquivalence(victim.powerCalc(0.5,2), 0.25, POSITIVE_FRACTIONAL_NUMBER_POSITIVE_POWER);
        checkEquivalence(victim.powerCalc(0.5,-2), 4, POSITIVE_FRACTIONAL_NUMBER_NEGATIVE_POWER);
        checkEquivalence(victim.powerCalc(-0.5,2), 0.25, NEGATIVE_FRACTIONAL_NUMBER_POSITIVE_POWER);
        checkEquivalence(victim.powerCalc(-0.5,3), -0.125, NEGATIVE_FRACTIONAL_NUMBER_POSITIVE_POWER);
        checkEquivalence(victim.powerCalc(-0.5,-2), 4, NEGATIVE_FRACTIONAL_NUMBER_NEGATIVE_POWER);
        checkEquivalence(victim.powerCalc(-0.5,-3), -8, NEGATIVE_FRACTIONAL_NUMBER_NEGATIVE_POWER);
    }

    public static void main(String[] args) {

        PowerCalculatorTest myTest = new PowerCalculatorTest();

        myTest.test1();
    }

}

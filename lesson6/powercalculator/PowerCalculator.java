package lv.javaguru.lesson6.powercalculator;

public class PowerCalculator {

    public double powerCalc(double x, int power) {

        double result = 1;

        if (power == 0) {
            result = 1;
        } else if (power == 1) {
            result = x;
        } else if (x == 0) {
            result = 0;
        } else {
            for (int i = Math.abs(power); i > 0; i--) {
                result *= x;
            }
            if (power < 0) result = 1 / result;
        }
        return result;
    }
}


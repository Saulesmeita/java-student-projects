package lv.javaguru.lesson8.mathoperations;

public class SubtractionOperation implements MathOperation {

    public final String NAME = "subtraction";
    public final char SIGN = '-';

    @Override
    public double compute(double a, double b) {
        return a - b;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public char getSign() {
        return SIGN;
    }
}

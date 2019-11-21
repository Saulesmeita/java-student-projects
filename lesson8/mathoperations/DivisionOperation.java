package lv.javaguru.lesson8.mathoperations;

public class DivisionOperation implements MathOperation {

    public final String NAME = "division";
    public final char SIGN = '/';

    @Override
    public double compute(double a, double b) {
        return a / b;
    }
}

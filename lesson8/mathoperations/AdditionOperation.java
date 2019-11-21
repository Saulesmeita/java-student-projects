package lv.javaguru.lesson8.mathoperations;

public class AdditionOperation implements MathOperation {

    public final String NAME = "addition";
    public final char SIGN = '+';

    @Override
    public double compute(double a, double b) {
        return a + b;
    }
}

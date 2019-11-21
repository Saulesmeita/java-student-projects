package lv.javaguru.lesson8.mathoperations;

public class MultiplicationOperation implements MathOperation {

    public final String NAME = "multiplication";
    public final char SIGN = '*';

    @Override
    public double compute(double a, double b) {
        return a * b;
    }
}

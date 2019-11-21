package lv.javaguru.lesson8.mathoperations;

public interface MathOperation {

    public final String NAME = "operation";
    public final char SIGN = '#';

    double compute(double a, double b);
}

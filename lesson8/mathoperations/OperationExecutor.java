package lv.javaguru.lesson8.mathoperations;

public class OperationExecutor {

    void execute(MathOperation[] operations, double a, double b) {
        for (MathOperation op : operations) {
            System.out.println(op.getName() + ": " + a + " " +  op.getSign() + " " +  b + " = " + op.compute(a,b));
        }
    }
}

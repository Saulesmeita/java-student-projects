package lv.javaguru.lesson8.mathoperations;

public class MathOperationsDemo {

    public static void main(String[] args) {

        MathOperation[] operations = new MathOperation[4];
        operations[0] = new AdditionOperation();
        operations[1] = new SubtractionOperation();
        operations[2] = new MultiplicationOperation();
        operations[3] = new DivisionOperation();

        OperationExecutor ex = new OperationExecutor();

        System.out.println();
        ex.execute(operations, 15, 3);
    }
}

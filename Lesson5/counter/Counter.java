package lv.javaguru.lesson5.counter;

public class Counter {

    private final int MIN_VALUE = 0;
    private final int MAX_VALUE = 100;
    private final int MIN_STEP = 1;
    private final int MAX_STEP = 10;

    private int value;
    private int step;

    public Counter() {
        this.value = MIN_VALUE;
        this.step = MIN_STEP;
    }

    public void increment() {
        int checkIncrement = value + step;
        if (checkIncrement <= MAX_VALUE) {
            value = checkIncrement;
            System.out.println("The counter value was incremented by " + step + ", and now is: " + value + ".");
        } else {
            System.out.println("Operation 'Increment' has failed: the new value must must not exceed " + MAX_VALUE + ".");
        }
        printOutCounter();
    }

    public void decrement() {
        int checkDecrement = value - step;
        if (checkDecrement >= MIN_VALUE) {
            value = checkDecrement;
            System.out.println("The counter value was decremented by " + step + ", and now is: " + value + ".");
        } else {
            System.out.println("Operation 'Decrement' has failed: the new value must not be less then " + MIN_VALUE + ".");
        }
        printOutCounter();
    }

    public void reset() {
        value = MIN_VALUE;
        step = MIN_STEP;
        System.out.println("The counter reset has finished successfully.");
        printOutCounter();
    }

    public int getValue() {
        return value;
    }

    public int getStep() {
        return step;
    }

    public void setValue(int value) {
        if (value >= MIN_VALUE && value <= MAX_VALUE) {
            this.value = value;
            System.out.println("Counter has been successfully updated to a new value!");
        } else {
            System.out.println("Operation 'Set Value' has failed: new value must be between " + MIN_VALUE + " and " + MAX_VALUE + ".");
        }
        printOutCounter();
    }

    public void setStep(int step) {
        if (step >= MIN_STEP && step <= MAX_STEP) {
            this.step = step;
            System.out.println("The step has been successfully updated to a new value!");
        } else {
            System.out.println("Operation 'Set Step' has failed: new value must be between " + MIN_STEP + " and " + MAX_STEP + ".");
        }
        printOutCounter();
    }

    public void printOutCounter() {
        System.out.println("Counter value = " + value + ", Step value = " + step + ".");
    }
}

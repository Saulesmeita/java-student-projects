package lv.javaguru.lesson5.counter;

public class Main {

    public static void main(String[] args) {

        Counter counter = new Counter();
        counter.printOutCounter();

        counter.increment();
        System.out.println("New counter value = " + counter.getValue());

        counter.setStep(5);
        System.out.println("New Step is " + counter.getStep());

        counter.setStep(14);

        counter.setValue(120);

        counter.setStep(-2);
        counter.setStep(0);

        counter.setValue(-60);

        counter.setValue(98);
        counter.setStep(2);
        counter.increment();
        counter.increment();

        counter.setValue(7);
        counter.setStep(5);
        counter.decrement();
        counter.decrement();
    }
}

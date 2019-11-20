package lv.javaguru.lesson8.animals;

public class Bat extends Mammal implements Flyable {

    public Bat(boolean hasOffspring, String sex) {
        super("Grey", 0.1, 0.05, 0.03, hasOffspring, "Vegetarian", sex, 41);
    }

    @Override
    public void eat() {
        System.out.println("The bat is eating fruits");
    }

    @Override
    public void drink() {
        System.out.println("The bat is drinking juice");
    }

    @Override
    public void sleep() {
        System.out.println("The bat is hanging with its head down and sleeping");
    }

    @Override
    public void fly(double length, double height) {
        System.out.println("The bat is very good at flying, too!");
    }
}

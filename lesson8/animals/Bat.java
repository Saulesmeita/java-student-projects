package lv.javaguru.lesson8.animals;

public class Bat extends Mammal implements Flyable {

    public Bat() {
        super("Grey", 0.1, 0.05, 0.03, true, "Vegetarian", "Female", 41);
        this.speciesName = "Bat";
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

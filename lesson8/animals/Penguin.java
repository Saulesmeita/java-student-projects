package lv.javaguru.lesson8.animals;

public class Penguin extends Bird implements Swimmable, Runnable {

    public Penguin() {
        super("Black and white", 3, 0.25, 0.1, false, "Carnivore", 39, "Male");
        this.speciesName = "Penguin";
    }

    @Override
    public void eat() {
        System.out.println("Penguin is eating fish");
    }

    @Override
    public void drink() {
        System.out.println("Penguin is drinking water");
    }

    @Override
    public void sleep() {
        System.out.println("Penguin is sleeping while it is standing");
    }

    @Override
    public void run(int distance) {
        System.out.println("The penguin is running");
    }

    @Override
    public void swim(int distance, int depth) {
        System.out.println("The penguin is swimming and diving. In fact, it is flying, but underwater");
    }

}

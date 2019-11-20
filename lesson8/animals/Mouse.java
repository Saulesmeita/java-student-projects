package lv.javaguru.lesson8.animals;

public class Mouse extends Mammal implements Runnable, Swimmable {

    public Mouse() {
        super("Grey", 0.05, 0.06, 0.03, false, "Vegetarian", "Male", 38);
        this.speciesName = "Mouse";
    }

    public String getSpeciesName() {
        return speciesName;
    }

    @Override
    public void eat() {
        System.out.println("Mouse is eating a seed");
    }

    @Override
    public void drink() {
        System.out.println("Mouse is drinking water");
    }

    @Override
    public void sleep() {
        System.out.println("Mouse is sleeping");
    }

    @Override
    public void run(int distance) {
        System.out.println("The mouse is running");
    }

    @Override
    public void swim(int distance, int depth) {
        System.out.println("The mouse is swimming, but not diving");
    }
}

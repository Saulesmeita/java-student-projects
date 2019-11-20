package lv.javaguru.lesson8.animals;

public class Dolphin extends Mammal implements Swimmable, Hunter, Speakable {

    public Dolphin() {
        super("Blue", 400, 2.5, 0.8, false, "Carnivore", "Male", 38);
        this.speciesName = "Dolphin";
    }

    @Override
    public void eat() {
        System.out.println("Dolphin eats fish");
    }

    @Override
    public void drink() {
        System.out.println("Dolphins do not drink");
    }

    @Override
    public void sleep() {
        System.out.println("The dolphin is half-sleeping");
    }

    @Override
    public void hunt(Animal game) {
        System.out.println("The dolphins hunt for fish only");
    }

    @Override
    public void speak() {
        System.out.println("Ssssshhh, Yoosshhh, Ke-ke-ke");
    }

    @Override
    public void swim(int distance, int depth) {
        System.out.println("The dolphin swims all its life long!");
    }
}

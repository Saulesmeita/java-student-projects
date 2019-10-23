package lv.javaguru.lesson3;

public class HumanDemo {

    public static void main(String[] args) {

        Human person1 = new Human("Captain Silver", 49);
        Human person2 = new Human("Pippy Longstocking", 9);

        person1.greet();
        person2.greet();
    }
}

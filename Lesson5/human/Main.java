package lv.javaguru.lesson5.human;

public class Main {

    public static void main(String[] args) {

        Human vasja = new Human("Basilio", "Gatolini", 45, 'm');
        Human alice = new Human("Alice", "The Fox", 33, 'f');
        Human fakeVasja = new Human("Basilio", "Gatolini", 48, 'm');

        System.out.println(vasja);
        System.out.println(alice);

        vasja.setHungry(true);
        System.out.println("Vasja isHungry = " + vasja.isHungry());
        vasja.eat();
        System.out.println("Vasja isHungry = " + vasja.isHungry());

        alice.plusOneYear();
        System.out.println(alice);

        vasja.toAge(3);
        System.out.println(vasja);

        System.out.println(vasja.equals(alice));
        System.out.println(vasja.equals(fakeVasja));
    }
}

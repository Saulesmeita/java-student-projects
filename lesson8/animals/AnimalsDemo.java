package lv.javaguru.lesson8.animals;

public class AnimalsDemo {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Swimming competition. Recline and enjoy:");
        System.out.println();

        Swimmable[] swimmers = new Swimmable[5];
        swimmers[0] = new Dog("White", 8);
        swimmers[1] = new Cat("Red", 4);
        swimmers[2] = new Dolphin();
        swimmers[3] = new Mouse();
        swimmers[4] = new Penguin();

        for (Swimmable swimmer: swimmers) {
            swimmer.swim(10, 1);
        }
        System.out.println();
        System.out.println("Speech abilities demonstration:");
        System.out.println();

        Speakable[] speakers = new Speakable[5];
        speakers[0] = new Parrot("Yellow");
        speakers[1] = new Parrot("White");
        speakers[2] = new Parrot("Green");
        speakers[3] = new Dolphin();
        speakers[4] = new Dolphin();

        for (Speakable speaker: speakers) {
            speaker.speak();
        }

        System.out.println();
        System.out.println("Cats and their habits:");
        System.out.println();

        Cat cat1 = new Cat("Grey", 4);
        cat1.setHasOffspring(true);
        cat1.setSex("Female");
        Cat cat2 = new Cat("Black", 5);
        cat2.setHasOffspring(true);

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println("Are these two cats equal?");
        System.out.println(cat1.equals(cat2));

        System.out.println();
        System.out.println("Offspring care demonstration:");
        System.out.println();
        System.out.println("Female cat:");
        cat1.offspringCare();
        System.out.println();
        System.out.println("Male cat:");
        cat2.offspringCare();

        System.out.println();
        System.out.println("Other behavior:");
        System.out.println();

        cat1.eat();
        cat1.drink();
        cat1.sleep();
        cat1.run(300);
        cat1.swim(100, 0);

        Mouse mouse1 = new Mouse();

        cat1.hunt(mouse1);

        Dog dog1 = new Dog("Brown", 20);
        Dog dog2 = new Dog("Brown", 20);

        cat1.hunt(dog1);

        System.out.println();
        System.out.println("Dogs and their behaviour:");
        System.out.println();

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println();
        System.out.println("Are these two dogs equal?");
        System.out.println(dog1.equals(dog2));

        dog1.setSex("Female");
        dog1.setHasOffspring(true);
        dog2.setHasOffspring(true);

        System.out.println();
        System.out.println("Offspring care - females:");
        System.out.println();

        dog1.offspringCare();

        System.out.println();
        System.out.println("Offspring care - males:");
        System.out.println();

        dog2.offspringCare();

        System.out.println();
        System.out.println("Other dogs' behaviour samples:");
        System.out.println();

        dog1.eat();
        dog1.drink();
        dog1.sleep();
        dog2.run(500);
        dog2.bringItems("slippers");
        dog1.bringItems("newspaper");

        System.out.println();
        System.out.println("Now parrots:");
        System.out.println();

        Parrot parrot1 = new Parrot("Green");
        Parrot parrot2 = new Parrot("Green");
        System.out.println(parrot1);
        System.out.println(parrot2);
        System.out.println();
        System.out.println("Are these two parrots equal?");
        System.out.println(parrot1.equals(parrot2));
        System.out.println();
        parrot1.setName("Koko");
        parrot1.setSex("Female");
        parrot1.setHasOffspring(true);
        parrot2.setHasOffspring(true);

        System.out.println(parrot1);
        System.out.println(parrot2);

        parrot1.speak();
        parrot2.speak();
        parrot1.eat();
        parrot1.drink();
        parrot1.fly(2,2);
        parrot1.sleep();

        System.out.println("Parrots are laying eggs:");
        System.out.println();
        parrot1.layEggs();
        parrot2.layEggs();

        System.out.println();
        System.out.println("Parrots are hatching eggs:");
        System.out.println();

        parrot1.hatchEggs();
        parrot2.hatchEggs();

        System.out.println();
        System.out.println("Offspring care:");
        System.out.println();
        System.out.println("Female:");
        System.out.println();
        parrot1.offspringCare();

        System.out.println();
        System.out.println("Male:");
        System.out.println();
        parrot2.offspringCare();
    }

}

package lv.javaguru.lesson8.classwork;

public class AlienDemo {

    public static void main(String[] args) {

        Alien alien1 = new Alien("a1b1c23", "Aldebaran", 511);
        Alien alien2 = new Alien("Cyndy", "Venus", 18);
        Alien alien3 = new Alien("M08", "Mars", 44);
        Alien alien4 = new Alien("Vasja", "Earth", 22);

        System.out.println();
        System.out.println(alien1);
        System.out.println(Alien.isAlien(alien1));
        System.out.println(alien2);
        System.out.println(Alien.isAlien(alien2));
        System.out.println(alien3);
        System.out.println(Alien.isAlien(alien3));
        System.out.println(alien4);
        System.out.println(Alien.isAlien(alien4));

        Human human1 = new Human("Olga", 33, "Ivanova");
        System.out.println();
        System.out.println(human1);
        System.out.println(Alien.isAlien(human1));
    }
}

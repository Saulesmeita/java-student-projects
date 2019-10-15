package lv.javaguru.lesson3;

public class FilisDomesticus {

    String name;
    int age;
    final int livesFromStart = 9;
    int livesLeft;
    boolean furry;
    String color;
    double weight;
    private boolean lazy;

    public FilisDomesticus(String name, int age, boolean furry, String color, double weight) {
        this.name = name;
        this.age = age;
        this.furry = furry;
        this.color = color;
        this.weight = weight;
        this.livesLeft = livesFromStart;
    }

    public void setLazy (boolean lazy) {
        this.lazy = lazy;
    }

    public void weightMyCat() {

        if (weight < 1) {
            System.out.println("It's a kitten!");
        } else if (weight >= 1 && weight <= 3) {
            System.out.println("Good healthy weight");
        } else System.out.println("It is really big!");

    }

    public void jump(double height) {

        if (lazy && Math.random() > 0.5) {
            System.out.println(name + " is too lazy to jump");
        } else {
            System.out.println("Your cat " + name + " has jumped " + height + " cm high");
        }
    }

    public void sum(int a1, int a2) {

        if (age <= 1) {
            System.out.println("Kittens are not good at mathematics!");
        } else {
            System.out.println(a1 + " + " + a2 + " = " + (a1 + a2));
        }
    }

    public void sub(int a1, int a2) {

        if (age <= 1) {
            System.out.println("Kittens are not good at mathematics!");
        } else {
            System.out.println(a1 + " - " + a2 + " = " + (a1 - a2));
        }
    }

}


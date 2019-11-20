package lv.javaguru.lesson8.animals;

import java.util.Objects;

public class Dog extends Mammal implements Swimmable, Runnable {

    private int age = 3;
    private String breed = "Shepherd";
    private String name= "NoName";

    public Dog(String color, double weight) {
        super(color, weight, 1, 0.6, false, "Carnivore", "Male", 39);
        this.speciesName = "Dog";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("The dog eats");
    }

    @Override
    public void drink() {
        System.out.println("The dog drinks");
    }

    @Override
    public void sleep() {
        System.out.println("The dog sleeps");
    }

    public void bringItems (String item) {
        System.out.println("The dog has brought you the " + item);
    }

    @Override
    public void run(int distance) {
        System.out.println("The dog has ran " + distance + "m.");
    }

    @Override
    public void swim(int distance, int depth) {
        System.out.println("The dog has done its best to swim for " + distance + "m.");
    }

    @Override
    public String toString() {
        return String.format("Dog {Breed = '%s', Color = '%s', Age = %d, Name = '%s', Weight = %f}",
                this.getBreed(), this.getColor(), this.getAge(), this.getName(), this.getWeight());
    }

    @Override
    public boolean equals(Object otherDog) {
        if (this == otherDog) return true;
        if (otherDog == null || getClass() != otherDog.getClass()) return false;
        Dog other = (Dog) otherDog;
        if (Objects.equals(this.getBreed(), other.getBreed())
                && Objects.equals(this.getColor(), other.getColor())
                && Objects.equals(this.getAge(), other.getAge())
                && Objects.equals(this.getName(), other.getName())
                && Objects.equals(this.getWeight(), other.getWeight())) {
            return true;
        } else {
            return false;
        }
    }
}

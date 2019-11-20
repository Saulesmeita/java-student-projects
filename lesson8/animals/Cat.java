package lv.javaguru.lesson8.animals;

import java.util.Objects;

public class Cat extends Mammal implements Hunter, Swimmable, Runnable {

    private String breed = "Common";
    private int age = 2;
    private String name = "Incognito";

    public Cat(String color, double weight) {
        super(color, weight, 0.4, 0.2, false, "Carnivore", "Male", 40);
        this.speciesName = "Cat";
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Cats eat meat, cats are carnivores!");
    }

    @Override
    public void drink() {
        System.out.println("The cat " + this.name + " is drinking water");
    }

    @Override
    public void sleep() {
        System.out.println("Do you know that a cat is an animal that sleeps 25 hours per day? Good night!");
    }

    @Override
    public void offspringCare() {
        if (hasOffspring) {
            if (this.sex.equals("Female")) {
                System.out.println("Breast-feeding and protect");
            } else {
                System.out.println("Do nothing");
            }
        }
    }

    @Override
    public void hunt(Animal game) {
        if (game.getWeight() <= this.getWeight() / 2) {
            System.out.println("Hunting a big " + game.getSpeciesName());
        } else {
            System.out.println("Cannot hunt a " + game.getSpeciesName() + ". This game is too big for a cat like me!");
        }
    }

    @Override
    public void run(int distance) {
        System.out.println("The cat is running");
    }

    @Override
    public void swim(int distance, int depth) {
        System.out.println("Cats are swimming. Sometimes. With disguise.");
    }

    @Override
    public String toString() {
        return String.format("Cat {Breed = '%s', Color = '%s', Age = %d, Name = '%s', Weight = %f}",
                this.getBreed(), this.getColor(), this.getAge(), this.getName(), this.getWeight());
    }

    @Override
    public boolean equals(Object otherCat) {
        if (this == otherCat) return true;
        if (otherCat == null || getClass() != otherCat.getClass()) return false;
        Cat other = (Cat) otherCat;
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

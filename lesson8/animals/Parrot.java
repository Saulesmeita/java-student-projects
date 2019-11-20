package lv.javaguru.lesson8.animals;

import java.util.Objects;
import java.util.Random;

public class Parrot extends Bird implements Flyable, Speakable, OffspringCare {

    private String breed = "Kakadu";
    private int age = 8;
    private String name = "Kesha";

    public Parrot(String color) {
        super(color, 0.3, 0.15, 0.7, false, "Vegetarian", 42, "Male");
        this.speciesName = "Parrot";
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
        System.out.println("Thank you, it was delicious!");;
    }

    @Override
    public void drink() {
        System.out.println("Water! Fresh water! I'm not thirsty any more!");
    }

    @Override
    public void sleep() {
        System.out.println("I feel so sleepy! Good night!");
    }

    @Override
    public void fly(double length, double height) {
        System.out.println("Your parrot is flying");
    }

    @Override
    public void speak() {
        String[] speechSamples = new String[4];
        speechSamples[0] = "Каррамба!";
        speechSamples[1] = "Коррида!";
        speechSamples[2] = "Чёрт побери!";
        speechSamples[3] = "Птица Говорун отличается умом и сообразительностью!";
        Random randomNumber = new Random();
        System.out.println(speechSamples[randomNumber.nextInt(4)]);
    }

    @Override
    public void hatchEggs() {
        if (sex.equals("Female")) {
            System.out.println(this.name + " is hatching eggs");
        } else {
            System.out.println(this.name + " is feeding the wife while she is hatching");
        }
    }

    @Override
    public String toString() {
        return String.format("Parrot {Breed = '%s', Color = '%s', Age = %d, Name = '%s', Weight = %f}",
                this.getBreed(), this.getColor(), this.getAge(), this.getName(), this.getWeight());
    }

    @Override
    public boolean equals(Object otherParrot) {
        if (this == otherParrot) return true;
        if (otherParrot == null || getClass() != otherParrot.getClass()) return false;
        Parrot other = (Parrot) otherParrot;
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

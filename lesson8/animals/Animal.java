package lv.javaguru.lesson8.animals;

import java.util.Objects;

public abstract class Animal {

    protected String color;
    protected double weight;
    protected double length;
    protected double height;
    protected boolean hasOffspring;
    protected String nutritionType;
    protected String speciesName;

    public Animal(String color, double weight, double length, double height, boolean hasOffspring, String nutritionType) {
        this.color = color;
        this.weight = weight;
        this.length = length;
        this.height = height;
        this.hasOffspring = hasOffspring;
        this.nutritionType = nutritionType;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isHasOffspring() {
        return hasOffspring;
    }

    public void setHasOffspring(boolean hasOffspring) {
        this.hasOffspring = hasOffspring;
    }

    public abstract void eat();
    public abstract void drink();
    public abstract void sleep();

    @Override
    public String toString() {
        return String.format("Animal {Color = '%s', Weight = '%f', Length = %f, Height = '%f', Has offspring = %b}",
                this.getColor(), this.getWeight(), this.getLength(), this.getHeight(), this.isHasOffspring());
    }

    @Override
    public boolean equals(Object otherAnimal) {
        if (this == otherAnimal) return true;
        if (otherAnimal == null || getClass() != otherAnimal.getClass()) return false;
        Cat other = (Cat) otherAnimal;
        if (Objects.equals(this.getColor(), other.getColor())
                && Objects.equals(this.getColor(), other.getColor())
                && Objects.equals(this.getWeight(), other.getWeight())
                && Objects.equals(this.getLength(), other.getLength())
                && Objects.equals(this.getHeight(), other.getHeight())
                && Objects.equals(this.isHasOffspring(), other.isHasOffspring())) {
            return true;
        } else {
            return false;
        }
    }
}

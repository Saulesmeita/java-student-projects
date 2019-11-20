package lv.javaguru.lesson8.animals;

public abstract class Bird extends Animal implements OffspringCare {

    protected double bloodTemperature;
    protected String sex;

    public Bird(String color, double weight, double length, double height, boolean hasOffspring, String nutritionType, double bloodTemperature, String sex) {
        super(color, weight, length, height, hasOffspring, nutritionType);
        this.bloodTemperature = bloodTemperature;
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void layEggs() {
        if (sex == "Female") {
            System.out.println("Laying eggs");
        }
    }

    public void hatchEggs() {
        System.out.println("Hatching eggs");
    }

    @Override
    public void offspringCare() {
        if (hasOffspring) {
            System.out.println("Feed and protect");
        }
    }
}

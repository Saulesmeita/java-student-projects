package lv.javaguru.lesson8.animals;

public abstract class Mammal extends Animal implements OffspringCare {

    protected String sex;
    protected double bloodTemperature;

    public Mammal(String color, double weight, double length, double height, boolean hasOffspring, String nutritionType, String sex, double bloodTemperature) {
        super(color, weight, length, height, hasOffspring, nutritionType);
        this.sex = sex;
        this.bloodTemperature = bloodTemperature;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getBloodTemperature() {
        return bloodTemperature;
    }

    public void setBloodTemperature(double bloodTemperature) {
        this.bloodTemperature = bloodTemperature;
    }

    public void offspringCare() {
        if (hasOffspring) {
            if (this.sex == "Female") {
                System.out.println("Breast-feeding and protect");
            } else {
                System.out.println("Protect");
            }
        }
    }
}

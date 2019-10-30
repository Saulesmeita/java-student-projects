package lv.javaguru.lesson5.human;

import java.util.Objects;

public class Human {

    private String name;
    private String surname;
    private int age;
    private char sex;

    private Body body;
    private Head head;
    private Leg leftLg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    private boolean isHungry = true;

    public Human(String name, String surname, int age, char sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        Body body = new Body();
        Head head = new Head();
        Leg leftLeg = new Leg();
        Leg rightLeg = new Leg();
        Hand leftHand = new Hand();
        Hand rightHand = new Hand();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public void eat() {
        this.isHungry = false;
        System.out.println("Human being " + this.getName() + " has had a delitious meal and is not hungry any more!");
    }

    public void toAge(int years) {
        this.age += years;
    }

    public void plusOneYear() {
        this.age++;
    }

    @Override
    public boolean equals(Object otherHuman) {
        if (this == otherHuman) return true;
        if (otherHuman == null || getClass() != otherHuman.getClass()) return false;
        Human other = (Human) otherHuman;
        if (Objects.equals(this.getName(), other.getName())
                && Objects.equals(this.getSurname(), other.getSurname())
                && Objects.equals(this.getAge(), other.getAge())
                && Objects.equals(this.getSex(), other.getSex())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        // return String.format(
        //      "Human {Name = '%s', surname ='%s', age ='%d', sex ='%c'}",
        //      this.getName(), this.getSurname(), this.getAge(), this.getSex());

        return "Human {"
                + "Name = '" + this.getName()
                + '\'' + ", surname ='" + this.getSurname() + '\'' +
                ", age ='" + this.getAge() + '\'' + ", sex ='" + this.getSex() + '\'' + '}';
    }


}

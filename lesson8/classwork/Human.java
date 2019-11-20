package lv.javaguru.lesson8.classwork;

public class Human extends Alien {

    private String familyName;

    public String getFamilyName() {
        return familyName;
    }

    public Human(String name, int age, String familyName) {
        super(name, "Earth", age);
        this.familyName = familyName;
    }
    @Override
    public String toString() {
        return String.format("Human {Name = '%s', Surname = '%s', age = %d, id = %d, totally creatures = %d}",
                this.getName(), this.getFamilyName(), this.getAge(), this.getId(), Alien.nr);
    }
}

package lv.javaguru.lesson10.uservalidationservice;

public class User {

    private String firstName;
    private String lastName;
    private int age;
    private static int nr = 0;
    private int id;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public static int getNr() {
        return nr;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void setNr(int nr) {
        User.nr = nr;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", age = " + age +
                ", id = " + id +
                '}';
    }

    public String toStringShort() {
        return "User{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", age = " + age +
                '}';
    }
}

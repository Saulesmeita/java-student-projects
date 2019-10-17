package lv.javaguru.lesson3;

public class Human {

    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println ("Hello, nice to meet you! My name is " + name + ", I am " + age + " years old.");
    }

}

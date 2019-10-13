package lv.javaguru.lesson3;

public class Circle {

    double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    public double calculateArea() {

        return Math.PI * radius * radius;
    }

    public double calculateDiameter() {

        return 2 * radius;
    }

    public double calculateCircleLength() {

        return 2 * Math.PI * radius;
    }

    public void printOutCircle() {

        System.out.printf("Circle radius is %.2f cm, diameter = %.2f cm. %n", radius, calculateDiameter());
        System.out.printf("Circle area is %.2f square centimeters. %n", calculateArea());
        System.out.printf("Circle line length is %.2f cm. %n%n" , calculateCircleLength());
    }
}

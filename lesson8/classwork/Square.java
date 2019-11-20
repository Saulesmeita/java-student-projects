package lv.javaguru.lesson8.classwork;

public class Square extends Rectangle {

    public Square(String color, double a) {
        super(color, a, a);
    }

    @Override
    public double diagonal() {
        return a * Math.sqrt(2);
    }

    @Override
    double area() {
        return this.a * this.a;
    }
}

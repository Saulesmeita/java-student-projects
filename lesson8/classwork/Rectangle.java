package lv.javaguru.lesson8.classwork;

public class Rectangle extends Shape{

    protected double a;
    protected double b;

    public Rectangle(String color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    public double diagonal() {
        return Math.sqrt(a*a + b*b);
    }

    @Override
    double area() {
        return this.a * this.b;
    }
}

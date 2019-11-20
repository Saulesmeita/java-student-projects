package lv.javaguru.lesson8.shapes;

public class Circle extends AbstractShape {

    private double radius;

    public Circle(double radius) {
        super("Circle", false, 1, true);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}

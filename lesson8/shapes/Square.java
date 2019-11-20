package lv.javaguru.lesson8.shapes;

public class Square extends AbstractShape {

    private double side;

    public Square(double side) {
        super("Square", true, 4, false);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double diagonal() {
        return side * Math.sqrt(2);
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

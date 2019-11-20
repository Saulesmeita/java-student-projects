package lv.javaguru.lesson8.shapes;

public class Triangle extends AbstractShape {

    private double[] sides = new double[sidesCount];

    public Triangle(double side1, double side2, double side3) {
        super("Triangle", true, 3, false);
        this.sides[0] = side1;
        this.sides[1] = side2;
        this.sides[2] = side3;
        if (! isTriangle()) {
            this.name = "Not a Triangle";
        }
    }

    @Override
    public double getPerimeter() {
        double perimeter = 0;
        for (int i = 0; i < sidesCount; i++) {
            perimeter += sides[i];
        }
        return perimeter;
    }

    @Override
    public double getArea() {
        if (isTriangle()) {
            double p = getPerimeter() / 2;
            double area = p;
            for (int i = 0; i < sidesCount; i++) {
                area *= (p - sides[i]);
            }
            return Math.sqrt(area);
        } else {
            return 0;
        }
    }

    public boolean isTriangle() {
        double perimeter = getPerimeter();
        for (int i = 0; i < sidesCount; i++) {
            if (sides[i] >= (perimeter - sides[i])) {
                return false;
            }
        }
        return true;
    }
}

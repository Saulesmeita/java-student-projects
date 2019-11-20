package lv.javaguru.lesson8.shapes;

public abstract class AbstractShape implements Shape {

    protected String name;
    protected double area;
    protected double perimeter;
    protected boolean isPolygon;
    protected int sidesCount;
    protected boolean includesCurves;

    public AbstractShape(String name, boolean isPolygon, int sidesCount, boolean includesCurves) {
        this.name = name;
        this.isPolygon = isPolygon;
        this.sidesCount = sidesCount;
        this.includesCurves = includesCurves;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public boolean isPolygon() {
        return isPolygon;
    }

    public int getSidesCount() {
        return sidesCount;
    }

    public boolean isIncludesCurves() {
        return includesCurves;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getArea() {
        return 0;
    }
}

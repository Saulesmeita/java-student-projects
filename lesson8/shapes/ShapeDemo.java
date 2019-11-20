package lv.javaguru.lesson8.shapes;

public class ShapeDemo {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[5];
        shapes[0] = new Square(2);
        shapes[1] = new Circle(10);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new Triangle(4, 4, 4);
        shapes[4] = new Triangle(8, 3, 4);

        for (Shape shape: shapes) {
            System.out.println(shape.getName());
            System.out.println(shape.getArea());
        }

        Triangle tr1 = new Triangle(3,4,5);
        System.out.println(tr1.isTriangle());
        System.out.println(tr1.sidesCount);
        System.out.println(tr1.getPerimeter());
        System.out.println(tr1.getArea());
    }
}

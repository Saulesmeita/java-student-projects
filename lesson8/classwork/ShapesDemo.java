package lv.javaguru.lesson8.classwork;

public class ShapesDemo {

    public static void main(String[] args) {

        Square square = new Square("red", 1);
        System.out.println(square.diagonal());
        System.out.println(square.area());
        System.out.println();

        Rectangle rectangle = new Rectangle("yellow", 3, 4);
        System.out.println(rectangle.diagonal());
        System.out.println(rectangle.area());

        Shape[] shapesArray = new Shape[2];
        shapesArray[0] = square;
        shapesArray[1] = rectangle;

        for (int i = 0; i < 2; i++) {
            System.out.println(shapesArray[i].area());
        }

        for (Shape shape: shapesArray) {
            System.out.println(shape.area());
        }
    }
}

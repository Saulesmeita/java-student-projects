package lv.javaguru.lesson3;

public class CircleDemo {

    public static void main(String[] args) {

        Circle smallCircle = new Circle(2.0);
        Circle bigCircle = new Circle(9.99);

        smallCircle.printOutCircle();
        bigCircle.printOutCircle();
    }
}

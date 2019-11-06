package lv.javaguru.lesson6.car;

public class CarDemo {

    public static void main(String[] args) {

        Car mazda = new Car("Mazda", "navy", 220);
        Car tesla = new Car("Tesla", "white", 160);
        Car tesla1 = new Car("Tesla", "white", 160);

        System.out.println(mazda);
        System.out.println(tesla);

        mazda.compare(tesla1, tesla);
        mazda.compare(mazda, tesla1);

        System.out.println(mazda.getCurrentSpeed());
        System.out.println(mazda.isStopped());
        System.out.println(mazda.isDriving());
        System.out.println(mazda.canAccelerate());

        mazda.accelerate(50);

        System.out.println(mazda.getCurrentSpeed());
        System.out.println(mazda.isStopped());
        System.out.println(mazda.isDriving());
        System.out.println(mazda.canAccelerate());

        mazda.accelerate(280);

        System.out.println(mazda.getCurrentSpeed());
        System.out.println(mazda.isStopped());
        System.out.println(mazda.isDriving());
        System.out.println(mazda.canAccelerate());

        mazda.decelerate(70);

        System.out.println(mazda.getCurrentSpeed());
        System.out.println(mazda.isStopped());
        System.out.println(mazda.isDriving());
        System.out.println(mazda.canAccelerate());

        tesla.decelerate(-60);

        System.out.println(tesla.getCurrentSpeed());

        tesla.accelerate(35);

        System.out.println(tesla.getCurrentSpeed());
        System.out.println(tesla.isStopped());
        System.out.println(tesla.isDriving());
        System.out.println(tesla.canAccelerate());

        tesla.compare(tesla1, tesla);

        System.out.println(mazda);
        System.out.println(tesla);
        System.out.println(tesla1);

    }
}
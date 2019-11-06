package lv.javaguru.lesson6.car;

import java.util.Objects;

public class Car {

    private String model;
    private String color;
    private int maxSpeed;
    private int currentSpeed = 0;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void accelerate(int targetSpeed) {
        if (targetSpeed > maxSpeed) {
            targetSpeed = maxSpeed;
        }
        while (currentSpeed < targetSpeed) {
            currentSpeed++;
        }
    }

    public void decelerate(int targetSpeed) {
        if (targetSpeed < 0) {
            targetSpeed = 0;
        }
        while (currentSpeed > targetSpeed) {
            currentSpeed--;
        }
    }

    boolean isDriving() {
        return (currentSpeed > 0);
    }

    boolean isStopped() {
        return (currentSpeed == 0);
    }

    boolean canAccelerate() {
        return (currentSpeed < maxSpeed);
    }

    @Override
    public boolean equals(Object otherCar) {
        if (this == otherCar) return true;
        if (otherCar == null || getClass() != otherCar.getClass()) return false;
        Car other = (Car) otherCar;
        if (Objects.equals(this.getModel(), other.getModel())
                && Objects.equals(this.getColor(), other.getColor())
                && Objects.equals(this.getMaxSpeed(), other.getMaxSpeed())
                && Objects.equals(this.getCurrentSpeed(), other.getCurrentSpeed())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("Car {Model = '%s', Color = '%s', Maximum Speed = %d, Current Speed = %d}",
                this.getModel(), this.getColor(), this.getMaxSpeed(), this.getCurrentSpeed());
    }

    public void compare (Car car1, Car car2) {

        if (car1.equals(car2)) {
            System.out.println("Машины идентичны");
        } else {
            System.out.println("Машины разные");
        }
    }
}

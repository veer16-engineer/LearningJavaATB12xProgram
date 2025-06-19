package Tasks.ForLoop;

interface Vehicle {
    default void start() {
        System.out.println("Vehicle started");
    }

    static void fuelType() {
        System.out.println("Fuel type is Petrol");
    }
}

class Car implements Vehicle {}

public class InterfaceDefaultStatic {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        Vehicle.fuelType();
    }
}


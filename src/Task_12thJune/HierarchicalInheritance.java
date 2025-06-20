package Task_12thJune;

class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        Bike myBike = new Bike();

        myCar.start();  // Inherited from Vehicle
        myCar.drive();

        myBike.start(); // Inherited from Vehicle
        myBike.ride();
    }
}
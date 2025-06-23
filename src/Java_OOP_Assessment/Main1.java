package Java_OOP_Assessment;

public class Main1 {

    public static void main(String[] args) {
        // Create array of Vehicle objects
        Vehicle[] vehicles = {new Car(), new Bike()};

        // Polymorphic method calls
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }
    }
}

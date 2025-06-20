package Task_8thJune;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Creating objects of different types
        Vehicle genericVehicle = new Vehicle("Generic", "Model", 2020);
        Car myCar = new Car("Toyota", "Camry", 2022, 4, "Gasoline");
        Motorcycle myBike = new Motorcycle("Harley-Davidson", "Street 750", 2021, false, "Cruiser");

        // Demonstrating polymorphism
        Vehicle[] vehicles = {genericVehicle, myCar, myBike};

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo(); // Polymorphic method call
            vehicle.start(); // Polymorphism with overloading
            System.out.println(); // Blank line for separation
        }

        // Demonstrating method overloading
        myCar.start("smart"); // Calls overloaded start method
        myCar.honk(); // Calls Car's honk method
        myCar.honk(3); // Calls overloaded honk method

        // Demonstrating unique methods
        myBike.wheelie();

        // Demonstrating encapsulation
        System.out.println("\nCar Details:");
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Doors: " + myCar.getNumDoors());
        System.out.println("Fuel: " + myCar.getFuelType());
    }
}
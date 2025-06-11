package Tasks;

public class Car {

    String brand;
    String model;
    double price;

    // Constructor
    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a Car object
        Car car1 = new Car("Toyota", "Fortuner", 4000000);

        // Displaying car details
        car1.displayDetails();
    }
}

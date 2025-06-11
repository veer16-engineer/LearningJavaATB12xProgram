package Tasks;

public class Mobile {

    String brand;
    double price;

    // First constructor: takes only brand
    public Mobile(String brand) {
        this.brand = brand;
        this.price = 0.0; // Default price
    }

    // Second constructor: takes brand and price
    public Mobile(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // Method to display mobile details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Using first constructor
        Mobile m1 = new Mobile("Samsung");
        m1.displayDetails();

        System.out.println();

        // Using second constructor
        Mobile m2 = new Mobile("Apple", 89999.0);
        m2.displayDetails();
    }
}

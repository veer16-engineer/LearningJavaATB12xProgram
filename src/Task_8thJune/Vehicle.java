package Task_8thJune;

class Vehicle {
    // Private fields for encapsulation
    private String make;
    private String model;
    private int year;

    // Constructor using 'this' keyword
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter methods for encapsulated fields
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Method to be overridden in child classes
    public void displayInfo() {
        System.out.println("Vehicle: " + make + " " + model + " (" + year + ")");
    }

    // Method overloading - same name different parameters
    public void start() {
        System.out.println("Vehicle engine started.");
    }

    public void start(String keyType) {
        System.out.println("Vehicle engine started with " + keyType + " key.");
    }
}

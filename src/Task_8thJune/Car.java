package Task_8thJune;

class Car extends Vehicle {
    private int numDoors;
    private String fuelType;

    // Constructor using 'super' keyword
    public Car(String make, String model, int year, int numDoors, String fuelType) {
        super(make, model, year); // Calling parent constructor
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    // Getter methods
    public int getNumDoors() {
        return numDoors;
    }

    public String getFuelType() {
        return fuelType;
    }

    // Method overriding - same signature as parent
    @Override
    public void displayInfo() {
        super.displayInfo(); // Using super to call parent method
        System.out.println("Type: Car, Doors: " + numDoors + ", Fuel: " + fuelType);
    }

    // Method overloading in child class
    public void honk() {
        System.out.println("Beep beep!");
    }

    public void honk(int times) {
        for (int i = 0; i < times; i++) {
            System.out.print("Beep ");
        }
        System.out.println();
    }
}


package Task_8thJune;

class Motorcycle extends Vehicle {
    private boolean hasSideCar;
    private String bikeType;

    public Motorcycle(String make, String model, int year, boolean hasSideCar, String bikeType) {
        super(make, model, year);
        this.hasSideCar = hasSideCar;
        this.bikeType = bikeType;
    }

    // Getter methods
    public boolean hasSideCar() {
        return hasSideCar;
    }

    public String getBikeType() {
        return bikeType;
    }

    // Method overriding
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Motorcycle, Sidecar: " + hasSideCar + ", Bike Type: " + bikeType);
    }

    // Unique method for Motorcycle
    public void wheelie() {
        System.out.println("Performing a wheelie!");
    }
}


package Task_9thJune;

class Car {
    String brand;
    String model;
    double price;

    // Constructor
    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Hyundai", "Creta", 1200000);
        car1.display();
    }
}

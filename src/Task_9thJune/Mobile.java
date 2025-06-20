package Task_9thJune;

class Mobile {
    String brand;
    double price;

    // Constructor 1 - Only brand
    public Mobile(String brand) {
        this.brand = brand;
        this.price = 0.0;
    }

    // Constructor 2 - Brand and Price
    public Mobile(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        if (price > 0) {
            System.out.println("Price: ₹" + price);
        } else {
            System.out.println("Price: Not available");
        }
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung");
        Mobile m2 = new Mobile("Apple", 99999.99);

        m1.display();
        System.out.println();
        m2.display();
    }
}


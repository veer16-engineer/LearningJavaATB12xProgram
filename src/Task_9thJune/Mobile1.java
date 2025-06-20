package Task_9thJune;

public class Mobile1 {

        private String brand;
        private double price;

        // First constructor - takes only brand
        public Mobile1(String mobileBrand) {
            this.brand = mobileBrand;
            this.price = 0.0; // Default price when not specified
        }

        // Second constructor - takes brand and price
        public Mobile1(String mobileBrand, double mobilePrice) {
            this.brand = mobileBrand;
            this.price = mobilePrice;
        }

        // Method to display mobile information
        public void displayMobileInfo() {
            System.out.println("Mobile Brand: " + brand);
            if (price > 0) {
                System.out.println("Price: $" + price);
            } else {
                System.out.println("Price: Not specified");
            }
        }

        public static void main(String[] args) {
            // Using first constructor
            Mobile mobile1 = new Mobile("Samsung");
            mobile1.display();

            System.out.println(); // Blank line for separation

            // Using second constructor
            Mobile mobile2 = new Mobile("iPhone", 999.99);
            mobile2.display();
        }
    }


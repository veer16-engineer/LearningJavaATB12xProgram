package Tasks;

public class Rectangle {

    double length;
    double breadth;

    // Constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and display area
    public void displayArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a Rectangle object
        Rectangle rect = new Rectangle(10.5, 7.2);

        // Displaying the area
        rect.displayArea();
    }
}

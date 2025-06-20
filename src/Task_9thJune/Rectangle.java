package Task_9thJune;

class Rectangle {
    int length;
    int breadth;

    // Constructor
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        r.calculateArea();
    }
}

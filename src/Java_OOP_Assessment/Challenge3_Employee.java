package Java_OOP_Assessment;

public class Challenge3_Employee {

    private int id;
    private String name;
    private double salary;

    // Constructor
    public Challenge3_Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.printf("Employee ID: %d Employee Name: %s Employee Salary: %.1f%n",
                id, name, salary);
    }

    public static void main(String[] args) {
        // Create an Employee instance
        Challenge3_Employee emp = new Challenge3_Employee(1, "John Doe", 50000);

        // Display employee details
        emp.displayDetails();
    }
}

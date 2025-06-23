package Java_OOP_Assessment;

public class Challenge2_Student {

    private final String name;
    private final int rollNo;
    private final String section;

    // Constructor
    public Challenge2_Student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    // Method to print student details
    public void printDetails() {
        System.out.println("Student: " + name + ", Roll No: " + rollNo + ", Section: " + section);
    }

    public static void main(String[] args) {
        // Create a Student instance
        Challenge2_Student student = new Challenge2_Student("Bob", 101, "A");

        // Print the student details
        student.printDetails();
    }

}

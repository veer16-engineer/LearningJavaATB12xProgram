package Tasks;

public class Student
{
    String name;
int age;

// Constructor
public Student(String name, int age) {
    this.name = name;
    this.age = age;
}

// Method to display student details
public void display() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
}

// Main method to test the class
public static void main(String[] args) {
    // Creating an object of Student
    Student s1 = new Student("Alice", 20);

    // Displaying the student details
    s1.display();
}
}
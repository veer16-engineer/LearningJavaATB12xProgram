package Java_OOP_Assessment;

public class Challenge1_Person {

    private final String name;
    private final int age;

    // Constructor
    public Challenge1_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void display() {
        System.out.print("Name: " + name + ", Age: " + age + " ");
    }

    public static void main(String[] args) {
        // Create two Person instances
        Challenge1_Person person1 = new Challenge1_Person("John", 25);
        Challenge1_Person person2 = new Challenge1_Person("Alice", 30);

        // Display their details
        person1.display();
        person2.display();
    }

}

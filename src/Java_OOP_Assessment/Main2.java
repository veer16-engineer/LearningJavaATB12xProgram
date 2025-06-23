package Java_OOP_Assessment;

public class Main2 {

    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 60000, 10000);
        Developer developer = new Developer("John", 50, 160);

        System.out.println("Manager Salary: " + manager.calculateSalary());
        System.out.println("Developer Salary: " + developer.calculateSalary());
    }

}

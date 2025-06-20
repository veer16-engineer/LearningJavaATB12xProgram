package Task_8thJune;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 28, "Developer", 55000);

        // Polymorphism
        Person ref = emp;
        ref.showDetails(); // Calls overridden method in Employee

        emp.updateSalary(3000);           // Overloaded method
        emp.updateSalary(2000, 1000);     // Overloaded method

        System.out.println("\nAfter Salary Update:");
        emp.showDetails();
    }
}


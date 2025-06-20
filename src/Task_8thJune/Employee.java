package Task_8thJune;

class Employee extends Person {
    private String designation;
    private double salary;

    public Employee(String name, int age, String designation, double salary) {
        super(name, age); // super keyword
        this.designation = designation; // this keyword
        this.salary = salary;
    }

    // Method Overloading
    public void updateSalary(double bonus) {
        this.salary += bonus;
    }

    public void updateSalary(double bonus, double tax) {
        this.salary += bonus;
        this.salary -= tax;
    }

    // Method Overriding
    @Override
    public void showDetails() {
        super.showDetails(); // Calling parent method
        System.out.println("Designation: " + this.designation);
        System.out.println("Salary: " + this.salary);
    }
}


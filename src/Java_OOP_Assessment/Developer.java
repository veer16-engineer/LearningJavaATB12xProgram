package Java_OOP_Assessment;

// Developer subclass
class Developer extends Employee {
    double hourlyRate;
    int hoursWorked;

    Developer(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

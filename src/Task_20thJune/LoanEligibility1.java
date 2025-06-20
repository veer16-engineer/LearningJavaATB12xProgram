package Task_20thJune;

import java.util.Scanner;

public class LoanEligibility1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter credit score: ");
        int creditScore = scanner.nextInt();

        boolean isEligible = true;

        if (age < 18 || age > 80) {
            isEligible = false;
            System.out.println("Invalid age.");
        }

        if (salary < 30000) {
            isEligible = false;
            System.out.println("Salary below threshold.");
        }

        if (creditScore < 650 || creditScore > 850) {
            isEligible = false;
            System.out.println("Invalid credit score.");
        }

        if (isEligible) {
            System.out.println("Eligible for loan.");
        } else {
            System.out.println("Not eligible for loan.");
        }
    }
}

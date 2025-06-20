package Task_20thJune;

import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter credit score: ");
        int creditScore = sc.nextInt();

        if (age >= 18 && age <= 80 && salary >= 30000 && creditScore >= 650 && creditScore <= 850) {
            System.out.println("Eligible for loan.");
        } else {
            System.out.println("Not eligible for loan.");
        }
    }
}

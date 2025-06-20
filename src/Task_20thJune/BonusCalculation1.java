package Task_20thJune;

import java.util.Scanner;

public class BonusCalculation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter years of experience: ");
        int years = scanner.nextInt();
        double bonus = 0;

        if (years < 1) {
            bonus = 0;
        } else if (years <= 3) {
            bonus = salary * 0.05;
        } else if (years <= 6) {
            bonus = salary * 0.10;
        } else {
            bonus = salary * 0.15;
        }

        System.out.println("Bonus: ₹" + bonus);
    }
}

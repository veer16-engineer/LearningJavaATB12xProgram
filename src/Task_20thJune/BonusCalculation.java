package Task_20thJune;

import java.util.Scanner;

public class BonusCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of experience: ");
        int years = sc.nextInt();

        double bonus = 0;
        if (years >= 1 && years <= 3) bonus = 0.05 * salary;
        else if (years >= 4 && years <= 6) bonus = 0.10 * salary;
        else if (years > 6) bonus = 0.15 * salary;

        System.out.println("Bonus amount: ₹" + bonus);
    }
}

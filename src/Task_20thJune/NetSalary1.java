package Task_20thJune;

import java.util.Scanner;

public class NetSalary1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter basic pay: ");
        double basicPay = scanner.nextDouble();

        double hra = basicPay * 0.30; // 30% of basic pay
        double da = basicPay * 0.20;  // 20% of basic pay
        double grossSalary = basicPay + hra + da;

        double tax;
        if (grossSalary <= 500000) {
            tax = grossSalary * 0.10;
        } else if (grossSalary <= 1000000) {
            tax = grossSalary * 0.20;
        } else {
            tax = grossSalary * 0.30;
        }

        double netSalary = grossSalary - tax;
        System.out.println("Net Salary: ₹" + netSalary);
    }
}

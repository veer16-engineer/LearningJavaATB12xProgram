package Task_20thJune;

import java.util.Scanner;

public class NetSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Pay: ");
        double basic = sc.nextDouble();

        double hra = 0.20 * basic;  // 20% HRA
        double da = 0.10 * basic;   // 10% DA
        double gross = basic + hra + da;

        double tax = 0;
        if (gross > 50000) tax = 0.10 * gross;

        double netSalary = gross - tax;

        System.out.println("HRA: ₹" + hra);
        System.out.println("DA: ₹" + da);
        System.out.println("Tax: ₹" + tax);
        System.out.println("Net Salary: ₹" + netSalary);
    }
}


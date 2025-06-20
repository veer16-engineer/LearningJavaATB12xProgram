package Task_20thJune;

import java.util.Scanner;

public class TravelEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();  // Consume newline

        System.out.print("Enter visa status (valid/invalid): ");
        String visaStatus = sc.nextLine().toLowerCase();

        if (age >= 18 && visaStatus.equals("valid")) {
            System.out.println("Person is eligible to travel.");
        } else {
            System.out.println("Person is not eligible to travel.");
        }
    }
}


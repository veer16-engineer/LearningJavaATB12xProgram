package Task_20thJune;

import java.util.Scanner;

public class TravelEligibility1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Is visa valid (true/false)? ");
        boolean isVisaValid = scanner.nextBoolean();

        if (age >= 18 && isVisaValid) {
            System.out.println("Can travel.");
        } else {
            System.out.println("Cannot travel.");
        }
    }
}

package Java_Programming_Assessment;

import java.util.Scanner;

public class Challenge7_LargestOfThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Compare using if-else if
        if (a > b && a > c) {
            System.out.println("Largest number is: " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest number is: " + b);
        } else if (c > a && c > b) {
            System.out.println("Largest number is: " + c);
        } else {
            System.out.println("Two or more numbers are equal and largest.");
        }
    }
}

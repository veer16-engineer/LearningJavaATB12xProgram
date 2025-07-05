package Java_Wrapper_Assessment;

import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter second number: ");
            int denominator = scanner.nextInt();

            // Division operation in try block
            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Catch division by zero error
            System.out.println("Error: Cannot divide by zero");
        } finally {
            // This block always executes
            System.out.println("Finally block executed");
            scanner.close();
        }
    }
}
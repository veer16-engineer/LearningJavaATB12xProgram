package Java_Programming_Assessment;

import java.util.Scanner;

public class Challenge10_SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;
        boolean validOperation = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    validOperation = false;
                    result = 0;
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
                validOperation = false;
                result = 0;
        }

        if (validOperation) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}

package Java_Programming_Assessment;

import java.util.Scanner;

public class Challenge2_ArithmeticOperators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Arithmetic operations
        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Assignment operations
        System.out.println("\n--- Assignment Operators ---");
        int result = a;
        System.out.println("Initial value: " + result);

        result += b; // equivalent to result = result + b
        System.out.println("After +=: " + result);

        result -= b; // equivalent to result = result - b
        System.out.println("After -=: " + result);

        result *= b; // equivalent to result = result * b
        System.out.println("After *=: " + result);

        result /= b; // equivalent to result = result / b
        System.out.println("After /=: " + result);

        result %= b; // equivalent to result = result % b
        System.out.println("After %=: " + result);

        scanner.close();
    }
}

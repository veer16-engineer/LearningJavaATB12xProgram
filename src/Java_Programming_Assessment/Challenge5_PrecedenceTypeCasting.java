package Java_Programming_Assessment;

import java.util.Scanner;

public class Challenge5_PrecedenceTypeCasting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer and a double: ");
        int a = scanner.nextInt();
        double b = scanner.nextDouble();

        // Operator precedence
        int result1 = a + 5 * 3 - 2;
        int result2 = (a + 5) * (3 - 2);
        System.out.println("\n--- Operator Precedence ---");
        System.out.println("Without parentheses: " + a + " + 5 * 3 - 2 = " + result1);
        System.out.println("With parentheses: (" + a + " + 5) * (3 - 2) = " + result2);

        // Implicit casting
        double implicitResult = a + b;
        System.out.println("\n--- Implicit Casting ---");
        System.out.println(a + " (int) + " + b + " (double) = " + implicitResult + " (double)");

        // Explicit casting
        int explicitResult = a + (int)b;
        System.out.println("\n--- Explicit Casting ---");
        System.out.println(a + " (int) + (int)" + b + " = " + explicitResult + " (int)");

        // Mixed-type expressions
        System.out.println("\n--- Mixed-Type Expressions ---");
        System.out.println("(" + a + " + " + b + ") / 2 = " + (a + b)/2);
        System.out.println("(double)" + a + " / 3 = " + (double)a / 3);

        scanner.close();
    }
}

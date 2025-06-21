package Java_Programming_Assessment;

import java.util.Scanner;

public class Challenge3_ComparisonLogical {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Comparison operators
        System.out.println("\n--- Comparison Operators ---");
        System.out.println(a + " == " + b + ": " + (a == b));
        System.out.println(a + " != " + b + ": " + (a != b));
        System.out.println(a + " < " + b + ": " + (a < b));
        System.out.println(a + " > " + b + ": " + (a > b));
        System.out.println(a + " <= " + b + ": " + (a <= b));
        System.out.println(a + " >= " + b + ": " + (a >= b));

        // Logical operators
        System.out.println("\n--- Logical Operators ---");
        System.out.println("(" + a + " > " + b + ") && (" + a + " > 0): " + ((a > b) && (a > 0)));
        System.out.println("(" + a + " < " + b + ") || (" + a + " > 0): " + ((a < b) || (a > 0)));
        System.out.println("!(" + a + " > " + b + "): " + !(a > b));

        scanner.close();
    }
}

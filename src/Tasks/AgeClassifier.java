package Tasks;

import java.util.Scanner;
public class AgeClassifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Nested ternary to classify age
        String category = (age >= 18)
                ? (age >= 65 ? "Senior" : "Adult")
                : "Minor";

        System.out.println("You are a: " + category);

        scanner.close();
    }
}

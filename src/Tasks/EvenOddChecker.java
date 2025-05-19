package Tasks;

import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Ternary operator checks if number is even or odd
        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(number + " is " + result);

        scanner.close();
    }
}

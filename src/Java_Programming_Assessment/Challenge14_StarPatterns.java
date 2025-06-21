package Java_Programming_Assessment;
import java.util.Scanner;

public class Challenge14_StarPatterns {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pattern size (number of rows): ");
        int rows = scanner.nextInt();

        System.out.println("\n1. Right Triangle Star Pattern:");
        printRightTriangle(rows);

        System.out.println("\n2. Pyramid Star Pattern:");
        printPyramid(rows);

        scanner.close();
    }

    public static void printRightTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

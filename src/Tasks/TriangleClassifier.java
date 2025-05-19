package Tasks;

import java.util.Scanner;

public class TriangleClassifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter length of side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter length of side 3: ");
        double side3 = scanner.nextDouble();

        String triangleType = classifyTriangle(side1, side2, side3);
        System.out.println("The triangle is " + triangleType + ".");

        scanner.close();
    }

    public static String classifyTriangle(double a, double b, double c) {
        if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || b == c || a == c) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

}

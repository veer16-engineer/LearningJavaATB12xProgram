package Tasks;
import java.util.Scanner;
public class TriangleClassifier1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input side lengths
        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter side c: ");
        double c = scanner.nextDouble();

        // Check if it's a valid triangle using triangle inequality theorem
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Equilateral triangle");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Scalene triangle");
            }
        } else {
            System.out.println("Not a valid triangle");
        }

        scanner.close();
    }
}

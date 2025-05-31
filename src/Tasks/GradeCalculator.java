package Tasks;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input score
        System.out.print("Enter the numerical score (0-100): ");
        int score = scanner.nextInt();

        // Validate input range
        if (score < 0 || score > 100) {
            System.out.println("Invalid score! Please enter a value between 0 and 100.");
        } else {
            // Determine grade
            char grade;
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // Output result
            System.out.println("The letter grade is: " + grade);
        }

        scanner.close();
    }
}

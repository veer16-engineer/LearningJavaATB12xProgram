package Java_Programming_Assessment;
import java.util.Scanner;

public class Challenge4_IncrementDecrement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int original = num; // Save original value

        System.out.println("\n--- Original Value ---");
        System.out.println("Original: " + original);

        // Pre-increment demonstration
        System.out.println("\n--- Pre-increment (++num) ---");
        System.out.println("Before operation: " + num);
        System.out.println("Operation result: " + (++num));
        System.out.println("After operation: " + num);

        // Post-increment demonstration
        num = original; // Reset to original value
        System.out.println("\n--- Post-increment (num++) ---");
        System.out.println("Before operation: " + num);
        int postIncResult = num++;
        System.out.println("Operation returned: " + postIncResult);
        System.out.println("After operation: " + num);

        // Pre-decrement demonstration
        num = original; // Reset to original value
        System.out.println("\n--- Pre-decrement (--num) ---");
        System.out.println("Before operation: " + num);
        System.out.println("Operation result: " + (--num));
        System.out.println("After operation: " + num);

        // Post-decrement demonstration
        num = original; // Reset to original value
        System.out.println("\n--- Post-decrement (num--) ---");
        System.out.println("Before operation: " + num);
        int postDecResult = num--;
        System.out.println("Operation returned: " + postDecResult);
        System.out.println("After operation: " + num);

        scanner.close();
    }
}

package Java_Programming_Assessment;

public class Challenge13_MultiplicationTables {

    public static void main(String[] args) {
        System.out.println("Multiplication Tables (1 to 5)");
        System.out.println("-----------------------------");

        // Outer loop for tables (1 to 5)
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nTable of " + i + ":");
            System.out.println("--------------");

            // Inner loop for multipliers (1 to 10)
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%2d × %2d = %3d\n", i, j, i * j);
            }
        }
    }
}

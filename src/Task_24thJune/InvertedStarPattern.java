package Task_24thJune;

public class InvertedStarPattern {
    public static void main(String[] args) {
        int rows = 5;  // Number of rows

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();  // Move to next line after each row
        }
    }
}


package Task_24thJune;

public class StarPattern {
    public static void main(String[] args) {
        int rows = 5;  // You can change this number to print more or fewer rows

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();  // Move to the next line
        }
    }
}

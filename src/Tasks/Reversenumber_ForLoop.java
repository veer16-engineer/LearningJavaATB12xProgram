package Tasks;

public class Reversenumber_ForLoop {

    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = 0;

        System.out.println("Original Number: " + number);

        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversedNumber);
    }
}

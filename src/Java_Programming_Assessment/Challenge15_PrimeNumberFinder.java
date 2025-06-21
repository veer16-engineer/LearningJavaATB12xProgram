package Java_Programming_Assessment;

public class Challenge15_PrimeNumberFinder {

    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");

        // Special case for 2 (the only even prime)
        if (2 <= 100) {
            System.out.print("2 ");
        }

        // Check only odd numbers from 3 onwards
        for (int num = 3; num <= 100; num += 2) {
            boolean isPrime = true;
            // Check divisors up to square root of num
            int maxDivisor = (int) Math.sqrt(num);

            for (int div = 3; div <= maxDivisor; div += 2) {
                if (num % div == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}

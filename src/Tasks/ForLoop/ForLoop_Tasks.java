package Tasks.ForLoop;

public class ForLoop_Tasks {

    public static void main(String[] args) {

        // 1️⃣    Print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2️⃣  Print even numbers from 1 to 20
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 3️⃣  Print "Hello" 5 times
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }

        // 4️⃣  Print the sum of the first 10 natural numbers
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);

        // 5️⃣  Multiplication table of 5 (1 × 5 …10× 5)
        int n = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d × %d = %d%n", n, i, n * i);
        }


    }
}

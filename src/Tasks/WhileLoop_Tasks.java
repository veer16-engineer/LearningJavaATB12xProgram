package Tasks;

public class WhileLoop_Tasks {

    public static void main(String[] args) {

        // 1️⃣  Print numbers from 1 to 10
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // 2️⃣  Print even numbers from 1 to 20
        i = 2;
        while (i <= 20) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();

        // 3️⃣  Print "Java" 5 times
        int count = 0;
        while (count < 5) {
            System.out.println("Java");
            count++;
        }

        // 4️⃣  Sum of the first 10 natural numbers
        i = 1;
        int sum = 0;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);

        // 5️⃣  Multiplication table of 7 (1 × 7 … 10 × 7)
        int n = 7;
        i = 1;
        while (i <= 10) {
            System.out.printf("%d × %d = %d%n", n, i, n * i);
            i++;
        }
    }
}

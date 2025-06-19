package Tasks;
import java.util.Scanner;

public class BasicIf_Else {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1️⃣ Check if a Number is Positive or Negative
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0)
            System.out.println("Positive number");
        else if (num < 0)
            System.out.println("Negative number");
        else
            System.out.println("Zero");

        // 2️⃣ Check if a Number is Even or Odd
        if (num % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");

        // 3️⃣ Find the Maximum of Two Numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        if (a > b)
            System.out.println("Maximum: " + a);
        else if (b > a)
            System.out.println("Maximum: " + b);
        else
            System.out.println("Both numbers are equal");

        // 4️⃣ Check if a Character is a Vowel or Consonant
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("Vowel");
        else if (Character.isLetter(ch))
            System.out.println("Consonant");
        else
            System.out.println("Not a valid alphabet character");

        // 5️⃣ Check if a Person is Eligible to Vote (Age >= 18)
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age >= 18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible to vote");

        sc.close();
    }

}

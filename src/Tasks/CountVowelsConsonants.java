package Tasks;

import java.util.Scanner;

public class CountVowelsConsonants {


    public static void main(String[] args) {
        String input = null;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            input = scanner.nextLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        int vowels = 0, consonants = 0;
        input = input.toLowerCase(); // Convert to lowercase for easy checking

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') { // Check if it's a consonant (a letter but not a vowel)
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}

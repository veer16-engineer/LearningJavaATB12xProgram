package Java_String_Assessment;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // 1. Length of the string
        int length = input.length();

        // 2. First character of the string
        char firstChar = input.charAt(0);

        // 3. Substring demonstration
        // Find the last space to get the last word
        int lastSpaceIndex = input.lastIndexOf(' ');
        String substring = (lastSpaceIndex != -1) ? input.substring(lastSpaceIndex + 1) : input;

        // 4. Concatenation demonstration
        String result = "Length: " + length + ", First char: " + firstChar + ", Substring: " + substring;

        System.out.println(result);

        scanner.close();
    }
}

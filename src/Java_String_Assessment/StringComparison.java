package Java_String_Assessment;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter second string:");
        String str2 = scanner.nextLine();

        System.out.println("Enter third string:");
        String str3 = scanner.nextLine();

        // == operator comparison (compares references)
        boolean refEqual1 = (str1 == str2);
        boolean refEqual2 = (str1 == str3);

        // equals() method (compares content case-sensitively)
        boolean contentEqual1 = str1.equals(str2);
        boolean contentEqual2 = str1.equals(str3);

        // equalsIgnoreCase() method (compares content case-insensitively)
        boolean ignoreCaseEqual = str1.equalsIgnoreCase(str2);

        // compareTo() method (lexicographical comparison)
        int compareResult = str1.compareTo(str2);

        // Display results
        System.out.println("\nComparison Results:");
        System.out.println("Using == operator:");
        System.out.println("str1 == str2: " + refEqual1);
        System.out.println("str1 == str3: " + refEqual2);

        System.out.println("\nUsing equals():");
        System.out.println("str1.equals(str2): " + contentEqual1);
        System.out.println("str1.equals(str3): " + contentEqual2);

        System.out.println("\nUsing equalsIgnoreCase():");
        System.out.println("str1.equalsIgnoreCase(str2): " + ignoreCaseEqual);

        System.out.println("\nUsing compareTo():");
        System.out.println("str1.compareTo(str2): " + compareResult);
        System.out.println("Interpretation: " +
                (compareResult == 0 ? "Strings are equal" :
                        compareResult < 0 ? "str1 comes before str2" : "str1 comes after str2"));

        scanner.close();
    }
}

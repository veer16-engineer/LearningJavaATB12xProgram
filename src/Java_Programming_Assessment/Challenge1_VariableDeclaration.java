package Java_Programming_Assessment;

import java.util.Arrays;

public class Challenge1_VariableDeclaration {

    public static void main(String[] args) {
        // 1. Primitive Data Types
        byte fileSizeInKB = 127;            // 8-bit(-128 to 127)
        short temperature = -200;           // 16-bit (-32,768 to 32,767)
        int employeeCount = 2_147_483_647;  // 32-bit
        long globalPopulation = 8_000_000_000L; // 64-bit

        float piApproximation = 3.14159f;    // 32-bit floating point
        double exactPiValue = 3.141592653589793; // 64-bit floating point

        char grade = 'A';                   // Single 16-bit
        boolean isJavaFun = true;           // true or false

        // 2. Reference Data Types
        String companyName = "TechSolutions"; // String object
        int[] primeNumbers = {2, 3, 5, 7, 11}; // Array of integers

        // 3. Constants (final variables)
        final double TAX_RATE = 0.075;
        final int MAX_LOGIN_ATTEMPTS = 3;

        // 4. Multiple variables of same type
        int x = 10, y = 20, z = 30;

        // 5. Default initialization demonstration
        int defaultInt;                     // Declaration without initialization
        defaultInt = 100;                   // Initialization later

        // Printing all variables
        System.out.println("=== Primitive Data Types ===");
        System.out.println("Byte (fileSizeInKB): " + fileSizeInKB);
        System.out.println("Short (temperature): " + temperature);
        System.out.println("Int (employeeCount): " + employeeCount);
        System.out.println("Long (globalPopulation): " + globalPopulation);
        System.out.println("Float (piApproximation): " + piApproximation);
        System.out.println("Double (exactPiValue): " + exactPiValue);
        System.out.println("Char (grade): " + grade);
        System.out.println("Boolean (isJavaFun): " + isJavaFun);

        System.out.println("\n=== Reference Data Types ===");
        System.out.println("String (companyName): " + companyName);
        System.out.println("Array (primeNumbers): " + Arrays.toString(primeNumbers));

        System.out.println("\n=== Constants ===");
        System.out.println("TAX_RATE: " + TAX_RATE);
        System.out.println("MAX_LOGIN_ATTEMPTS: " + MAX_LOGIN_ATTEMPTS);

        System.out.println("\n=== Other Examples ===");
        System.out.println("Multiple vars (x,y,z): " + x + ", " + y + ", " + z);
        System.out.println("Default initialized (defaultInt): " + defaultInt);
    }

}

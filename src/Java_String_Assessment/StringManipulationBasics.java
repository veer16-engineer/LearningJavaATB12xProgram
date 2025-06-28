package Java_String_Assessment;

import java.util.Scanner;

public class StringManipulationBasics {
    public static void main(String[] args) {
        final int ITERATIONS = 1000;

        // Test String concatenation
        long startTime = System.currentTimeMillis();
        String strResult = "";
        for (int i = 0; i < ITERATIONS; i++) {
            strResult += "test" + i;
        }
        long stringTime = System.currentTimeMillis() - startTime;

        // Test StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) {
            sb.append("test").append(i);
        }
        long stringBuilderTime = System.currentTimeMillis() - startTime;

        // Test StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) {
            sbf.append("test").append(i);
        }
        long stringBufferTime = System.currentTimeMillis() - startTime;

        // Print results
        System.out.println("Performance Results for " + ITERATIONS + " iterations:");
        System.out.println("String concatenation: " + stringTime + "ms");
        System.out.println("StringBuilder: " + stringBuilderTime + "ms");
        System.out.println("StringBuffer: " + stringBufferTime + "ms");

        // Print ratio comparison
        System.out.println("\nPerformance Ratios:");
        System.out.printf("StringBuilder is %.1f times faster than String%n",
                (double)stringTime/stringBuilderTime);
        System.out.printf("StringBuffer is %.1f times faster than String%n",
                (double)stringTime/stringBufferTime);
        System.out.printf("StringBuilder is %.1f times faster than StringBuffer%n",
                (double)stringBufferTime/stringBuilderTime);
    }
}

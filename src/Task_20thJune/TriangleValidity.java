package Task_20thJune;

import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides of triangle: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Valid triangle.");
        } else {
            System.out.println("Invalid triangle.");
        }
    }
}


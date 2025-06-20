package Task_20thJune;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;

        System.out.print("Enter withdrawal amount: ₹");
        int amount = sc.nextInt();

        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
        } else if (amount % 100 != 0) {
            System.out.println("Amount must be in multiples of 100.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
        }
    }
}


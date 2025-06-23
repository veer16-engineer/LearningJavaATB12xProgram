package Java_OOP_Assessment;

public class Challenge4_BankAccount {

    private double balance;

    // Constructor to initialize balance
    public Challenge4_BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Balance after deposit: %.1f ", balance);
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    // Method to withdraw money with validation
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.printf("Balance after withdrawal: %.1f", balance);
            } else {
                System.out.println("Insufficient funds for withdrawal");
            }
        } else {
            System.out.println("Withdrawal amount must be positive");
        }
    }

    // Method to get current balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Create account with initial balance
        Challenge4_BankAccount account = new Challenge4_BankAccount(1000);

        // Perform transactions
        account.deposit(500);
        account.withdraw(200);
    }
}

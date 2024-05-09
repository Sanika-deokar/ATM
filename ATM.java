import java.util.Scanner;

// User class representing a user account
class User {
    private String userId;
    private String pin;

    public User(String userId, String pin) {
        this.userId = userId;
        this.pin = pin;
    }

    public String getUserId() {
        return userId;
    }

    public String getPin() {
        return pin;
    }
}

// ATM class containing methods to perform ATM operations
class ATM1 {
    private User currentUser;
    private double balance;

    public ATM1() {
        this.balance = 0.0;
    }

    public boolean login(String userId, String pin) {
        // For simplicity, let's assume any user ID and pin combination is valid
        if (currentUser == null) {
            currentUser = new User(userId, pin);
            return true;
        } else {
            return false; // User is already logged in
        }
    }

    public void showMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Transactions History");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer");
        System.out.println("5. Quit");
    }

    public void showTransactionsHistory() {
        // Placeholder method to display transaction history
        System.out.println("Transaction History:");
        // Get user's transaction list and print each transaction
    }

    public void withdraw(double amount) {
        // Placeholder method for withdrawing funds
        System.out.println("Withdraw: $" + amount);
    }

    public void deposit(double amount) {
        // Placeholder method for depositing funds
        System.out.println("Deposit: $" + amount);
    }

    public void transfer(double amount) {
        // Placeholder method for transferring funds
        System.out.println("Transfer: $" + amount);
    }
}

public class ATM {
    public static void main(String[] args) {
        ATM1 atm = new ATM1();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM!");

        String userId;
        String pin;

        // Prompt for user id
        System.out.print("Enter user ID: ");
        userId = scanner.nextLine();

        // Prompt for PIN
        System.out.print("Enter PIN: ");
        pin = scanner.nextLine();

        // Attempt login
        if (atm.login(userId, pin)) {
            System.out.println("Login successful!");

            int choice;
            do {
                atm.showMenu();
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        atm.showTransactionsHistory();
                        break;
                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        atm.withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        atm.deposit(depositAmount);
                        break;
                    case 4:
                        System.out.print("Enter transfer amount: ");
                        double transferAmount = scanner.nextDouble();
                        atm.transfer(transferAmount);
                        break;
                    case 5:
                        // Quit
                        System.out.println("Exiting ATM. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } while (choice != 5);
        } else {
            System.out.println("Login failed. Exiting ATM.");
        }

        scanner.close();
    }
}

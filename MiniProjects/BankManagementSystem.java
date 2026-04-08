import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Account Class: To handle encapsulation and basic account operations
class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Rs. " + amount + " deposited successfully.");
            System.out.println("New Balance: Rs. " + balance);
        } else {
            System.out.println("❌ Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("✅ Rs. " + amount + " withdrawn successfully.");
            System.out.println("New Balance: Rs. " + balance);
        } else if (amount > balance) {
            System.out.println("❌ Insufficient Balance! You don't have enough funds in your account.");
        } else {
            System.out.println("❌ Invalid withdrawal amount!");
        }
    }

    public void displayAccountInfo() {
        System.out.println("-------------------------------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Current Balance: Rs. " + balance);
        System.out.println("-------------------------------------------------");
    }
}

// Main Class: For running the system and handling user interaction
public class BankManagementSystem {
    // Using HashMap for fast lookup via Account Number
    private static Map<String, Account> accountsDatabase = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;

        System.out.println("=========================================");
        System.out.println("  Welcome to the Bank Management System  ");
        System.out.println("=========================================");

        while (isRunning) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Create New Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Account Balance");
            System.out.println("5. View All Accounts (Admin)");
            System.out.println("6. Exit");
            System.out.print("Select an option (1-6): ");

            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Please enter a valid number!");
                continue;
            }

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    performDeposit();
                    break;
                case 3:
                    performWithdraw();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    viewAllAccounts();
                    break;
                case 6:
                    System.out.println("Thank you for using our Bank Management System. Goodbye!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void createAccount() {
        System.out.print("Enter Account Number: ");
        String accNo = scanner.nextLine();

        if (accountsDatabase.containsKey(accNo)) {
            System.out.println("❌ This Account Number already exists!");
            return;
        }

        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Initial Deposit Amount: ");
        double initialDeposit = Double.parseDouble(scanner.nextLine());

        Account newAccount = new Account(accNo, name, initialDeposit);
        accountsDatabase.put(accNo, newAccount);
        System.out.println("✅ Account created successfully!");
    }

    private static void performDeposit() {
        System.out.print("Enter Account Number: ");
        String accNo = scanner.nextLine();

        Account account = accountsDatabase.get(accNo);
        if (account != null) {
            System.out.print("Enter Deposit Amount: ");
            double amount = Double.parseDouble(scanner.nextLine());
            account.deposit(amount);
        } else {
            System.out.println("❌ Account not found!");
        }
    }

    private static void performWithdraw() {
        System.out.print("Enter Account Number: ");
        String accNo = scanner.nextLine();

        Account account = accountsDatabase.get(accNo);
        if (account != null) {
            System.out.print("Enter Withdrawal Amount: ");
            double amount = Double.parseDouble(scanner.nextLine());
            account.withdraw(amount);
        } else {
            System.out.println("❌ Account not found!");
        }
    }

    private static void checkBalance() {
        System.out.print("Enter Account Number: ");
        String accNo = scanner.nextLine();

        Account account = accountsDatabase.get(accNo);
        if (account != null) {
            account.displayAccountInfo();
        } else {
            System.out.println("❌ Account not found!");
        }
    }

    private static void viewAllAccounts() {
        if (accountsDatabase.isEmpty()) {
            System.out.println("There are no accounts in the bank currently.");
        } else {
            System.out.println("\n--- All Registered Accounts ---");
            for (Account acc : accountsDatabase.values()) {
                acc.displayAccountInfo();
            }
        }
    }
}

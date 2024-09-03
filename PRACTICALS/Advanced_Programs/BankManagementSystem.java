import java.util.*;

class BankAccount {
    private int accountNumber;
    private String name;
    private double balance;

    public BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // Getters and setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Name: " + name + ", Balance: " + balance;
    }
}

public class BankManagementSystem {
    private static List<BankAccount> accounts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Set Account Number, Name, and Balance");
            System.out.println("2. Withdraw from an Account");
            System.out.println("3. Search for an Account");
            System.out.println("4. Delete an Account from Bank");
            System.out.println("5. Show stored object data");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    setAccountDetails(scanner);
                    break;
                case 2:
                    withdrawFromAccount(scanner);
                    break;
                case 3:
                    searchAccount(scanner);
                    break;
                case 4:
                    deleteAccount(scanner);
                    break;
                case 5:
                    showStoredData();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }

    private static void setAccountDetails(Scanner scanner) {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter balance: ");
        double balance = scanner.nextDouble();
        accounts.add(new BankAccount(accountNumber, name, balance));
        System.out.println("Account details set successfully.");
    }

    private static void withdrawFromAccount(Scanner scanner) {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            if (amount <= account.getBalance()) {
                account.setBalance(account.getBalance() - amount);
                System.out.println("Withdrawal successful! New balance: " + account.getBalance());
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void searchAccount(Scanner scanner) {
        System.out.print("Enter account number to search: ");
        int accountNumber = scanner.nextInt();
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            System.out.println("Account found: " + account);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void deleteAccount(Scanner scanner) {
        System.out.print("Enter account number to delete: ");
        int accountNumber = scanner.nextInt();
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            accounts.remove(account);
            System.out.println("Account deleted successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    private static BankAccount findAccount(int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    private static void showStoredData() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts stored.");
        } else {
            System.out.println("Stored account data:");
            for (BankAccount account : accounts) {
                System.out.println(account);
            }
        }
    }
}


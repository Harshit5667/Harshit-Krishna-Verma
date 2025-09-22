package package1;

import java.util.ArrayList;

public class BankAccount {
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;
    private final String accountNumber;
    private String accountHolderName;
    private double balance;
    private static ArrayList<BankAccount> accounts = new ArrayList<>();

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
        accounts.add(this);
    }

    public static void getTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        } else {
            System.out.println("Invalid account instance.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
    }

    public void transferFunds(BankAccount receiver, double amount) {
        if (receiver instanceof BankAccount && amount > 0 && amount <= this.balance) {
            this.withdraw(amount);
            receiver.deposit(amount);
        }
    }

    public static BankAccount searchAccount(String accountNumber) {
        for (BankAccount acc : accounts) {
            if (acc.accountNumber.equals(accountNumber))
                return acc;
        }
        return null;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Lynda Princy", "ACC12345", 1000.00);
        BankAccount account2 = new BankAccount("Prince Danish", "ACC67890", 500.00);

        account1.displayAccountDetails();
        account2.displayAccountDetails();

        getTotalAccounts();

        account1.deposit(200);
        account1.withdraw(150);

        account1.transferFunds(account2, 300);

        account1.displayAccountDetails();
        account2.displayAccountDetails();

        BankAccount search = BankAccount.searchAccount("ACC67890");
        if (search != null)
            search.displayAccountDetails();
    }
}

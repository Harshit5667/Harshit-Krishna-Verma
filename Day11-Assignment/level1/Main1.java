import java.util.*;

class Account {
    int accountNumber;
    double balance;
    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void showBalance() {
        System.out.println("Account " + accountNumber + " Balance: " + balance);
    }
}

class Customer {
    String name;
    List<Account> accounts = new ArrayList<>();
    Customer(String name) {
        this.name = name;
    }
    void addAccount(Account account) {
        accounts.add(account);
    }
    void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account a : accounts) {
            a.showBalance();
        }
    }
}

class Bank {
    String bankName;
    List<Customer> customers = new ArrayList<>();
    Bank(String bankName) {
        this.bankName = bankName;
    }
    void openAccount(Customer customer, int accountNumber, double balance) {
        Account account = new Account(accountNumber, balance);
        customer.addAccount(account);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
    }
    void showCustomers() {
        System.out.println("Bank: " + bankName);
        for (Customer c : customers) {
            c.viewBalance();
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");
        bank.openAccount(c1, 1001, 5000);
        bank.openAccount(c1, 1002, 2000);
        bank.openAccount(c2, 2001, 8000);
        bank.showCustomers();
    }
}

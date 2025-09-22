class BankAccount {
    int accountNumber;
    double balance;
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    void displayAccountType() {
        System.out.println("Savings Account -> Number: " + accountNumber + ", Balance: " + balance + ", Interest Rate: " + interestRate);
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    void displayAccountType() {
        System.out.println("Checking Account -> Number: " + accountNumber + ", Balance: " + balance + ", Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int duration;
    FixedDepositAccount(int accountNumber, double balance, int duration) {
        super(accountNumber, balance);
        this.duration = duration;
    }
    void displayAccountType() {
        System.out.println("Fixed Deposit Account -> Number: " + accountNumber + ", Balance: " + balance + ", Duration: " + duration);
    }
}

public class Main8 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, 5000, 4.5);
        CheckingAccount ca = new CheckingAccount(102, 2000, 1000);
        FixedDepositAccount fda = new FixedDepositAccount(103, 10000, 12);
        sa.displayAccountType();
        ca.displayAccountType();
        fda.displayAccountType();
    }
}

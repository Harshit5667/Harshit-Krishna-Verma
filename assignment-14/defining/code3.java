// Interface definition
interface Payment {
    void pay(double amount);
}

// UPI payment class
class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

// Credit Card payment class
class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

// Wallet payment class
class Wallet implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Wallet.");
    }
}

// Main class
public class PaymentDemo {
    public static void main(String[] args) {
        Payment upi = new UPI();
        Payment card = new CreditCard();
        Payment wallet = new Wallet();

        upi.pay(500.0);
        card.pay(1500.5);
        wallet.pay(250.75);
    }
}

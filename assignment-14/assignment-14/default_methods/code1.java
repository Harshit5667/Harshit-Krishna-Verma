interface PaymentProcessor {
    void processPayment(double amount);

    // New default method added later
    default void refund(double amount) {
        System.out.println("Refund feature not supported by this provider.");
    }
}

// Old provider (didn't implement refund)
class PayPal implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processed payment of ₹" + amount + " via PayPal.");
    }
}

// New provider supports refund
class RazorPay implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processed payment of ₹" + amount + " via RazorPay.");
    }

    public void refund(double amount) {
        System.out.println("Refunded ₹" + amount + " via RazorPay.");
    }
}

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPal();
        PaymentProcessor razorpay = new RazorPay();

        paypal.processPayment(1000);
        paypal.refund(500);

        razorpay.processPayment(2000);
        razorpay.refund(1000);
    }
}

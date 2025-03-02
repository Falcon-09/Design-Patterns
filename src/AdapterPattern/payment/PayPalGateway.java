package AdapterPattern.payment;

/**
 * Represents the PayPal payment gateway with its own interface.
 */
public class PayPalGateway {
    public void sendPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }

    public void refundPayment(double amount) {
        System.out.println("Refunding PayPal payment of $" + amount);
    }
}

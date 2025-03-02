package AdapterPattern.payment;

/**
 * Represents the Stripe payment gateway with its own interface.
 */
public class StripeGateway {
    public void charge(double amount) {
        System.out.println("Processing Stripe payment of $" + amount);
    }

    public void refund(double amount) {
        System.out.println("Refunding Stripe payment of $" + amount);
    }
}

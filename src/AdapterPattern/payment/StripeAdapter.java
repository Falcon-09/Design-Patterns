package AdapterPattern.payment;

public class StripeAdapter implements PaymentGateway{
    private final StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(double amount) {
        stripeGateway.charge(amount);
    }

    @Override
    public void refundPayment(double amount) {
        stripeGateway.refund(amount);
    }
}

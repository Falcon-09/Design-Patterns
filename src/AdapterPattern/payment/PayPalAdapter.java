package AdapterPattern.payment;

public class PayPalAdapter implements PaymentGateway{
    private final PayPalGateway payPalGateway;

    public PayPalAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    @Override
    public void processPayment(double amount) {
        payPalGateway.sendPayment(amount);
    }

    @Override
    public void refundPayment(double amount) {
        payPalGateway.refundPayment(amount);
    }
}

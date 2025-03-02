package AdapterPattern;

import AdapterPattern.payment.*;

public class Main {
    public static void main(String[] args) {
        // Use PayPal through the adapter
        PayPalGateway payPalGateway = new PayPalGateway();
        PaymentGateway payPalAdapter = new PayPalAdapter(payPalGateway);
        payPalAdapter.processPayment(100.0);
        payPalAdapter.refundPayment(50.0);

        // Use Stripe through the adapter
        StripeGateway stripeGateway = new StripeGateway();
        PaymentGateway stripeAdapter = new StripeAdapter(stripeGateway);
        stripeAdapter.processPayment(200.0);
        stripeAdapter.refundPayment(75.0);
    }
}

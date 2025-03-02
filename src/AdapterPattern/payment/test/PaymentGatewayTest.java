package AdapterPattern.payment.test;

import AdapterPattern.payment.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PaymentGatewayTest {
    @Test
    public void testPayPalAdapter() {
        PayPalGateway payPalGateway = new PayPalGateway();
        PaymentGateway payPalAdapter = new PayPalAdapter(payPalGateway);

        payPalAdapter.processPayment(100.0);
        payPalAdapter.refundPayment(50.0);
    }

    @Test
    public void testStripeAdapter() {
        StripeGateway stripeGateway = new StripeGateway();
        PaymentGateway stripeAdapter = new StripeAdapter(stripeGateway);

        stripeAdapter.processPayment(200.0);
        stripeAdapter.refundPayment(75.0);
    }
}

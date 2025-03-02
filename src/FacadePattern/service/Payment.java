package FacadePattern.service;

import FacadePattern.exception.PaymentFailedException;

public class Payment {
    public void processPayment(double amount) throws PaymentFailedException {
        // Simulate payment processing
        if (amount > 0) {
            System.out.println("Payment processed successfully: $" + amount);
        } else {
            throw new PaymentFailedException("Payment failed: Invalid amount");
        }
    }
}

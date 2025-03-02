package AdapterPattern.payment;

public interface PaymentGateway {
    void processPayment(double amount);
    void refundPayment(double amount);
}

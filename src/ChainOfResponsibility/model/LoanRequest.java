package ChainOfResponsibility.model;

public class LoanRequest {
    private double amount;

    public LoanRequest(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

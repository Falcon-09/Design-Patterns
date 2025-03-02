package FacadePattern.model;

public class Order {
    private String orderId;
    private String productId;
    private int quantity;
    private double amount;

    // Constructor, getters, and setters
    public Order(String orderId, String productId, int quantity, double amount) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getAmount() {
        return amount;
    }
}

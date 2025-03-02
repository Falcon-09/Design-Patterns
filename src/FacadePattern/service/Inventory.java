package FacadePattern.service;

public class Inventory {
    public boolean checkInventory(String productId, int quantity) {
        // Simulate inventory check
        return true; // Assume inventory is always available for simplicity
    }

    public void updateInventory(String productId, int quantity) {
        // Simulate inventory update
        System.out.println("Inventory updated for product: " + productId);
    }
}

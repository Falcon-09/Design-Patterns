package FacadePattern.facade;

import FacadePattern.exception.InventoryUnavailableException;
import FacadePattern.exception.PaymentFailedException;
import FacadePattern.model.Order;
import FacadePattern.service.Inventory;
import FacadePattern.service.Payment;
import FacadePattern.service.Shipping;

public class OrderFacade {
    private Inventory inventory;
    private Payment payment;
    private Shipping shipping;

    public OrderFacade() {
        this.inventory = new Inventory();
        this.payment = new Payment();
        this.shipping = new Shipping();
    }

    public void placeOrder(Order order) throws PaymentFailedException, InventoryUnavailableException {
        if (!inventory.checkInventory(order.getProductId(), order.getQuantity())) {
            throw new InventoryUnavailableException("Inventory not available for product: " + order.getProductId());
        }

        payment.processPayment(order.getAmount());
        inventory.updateInventory(order.getProductId(), order.getQuantity());
        shipping.shipOrder(order.getOrderId());

        System.out.println("Order placed successfully: " + order.getOrderId());
    }
}

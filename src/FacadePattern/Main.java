package FacadePattern;

import FacadePattern.exception.InventoryUnavailableException;
import FacadePattern.exception.PaymentFailedException;
import FacadePattern.facade.OrderFacade;
import FacadePattern.model.Order;

public class Main {
    public static void main(String[] args) {
        // Create an order
        Order order = new Order("12345", "product1", 2, 100.0);

        // Create the facade
        OrderFacade orderFacade = new OrderFacade();

        try {
            // Place the order using the facade
            orderFacade.placeOrder(order);
            System.out.println("Order placement process completed successfully.");
        } catch (PaymentFailedException e) {
            System.out.println("Order failed: " + e.getMessage());
        } catch (InventoryUnavailableException e) {
            System.out.println("Order failed: " + e.getMessage());
        }
    }
}

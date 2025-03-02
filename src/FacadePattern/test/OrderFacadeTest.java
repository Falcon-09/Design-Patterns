package FacadePattern.test;

import FacadePattern.exception.InventoryUnavailableException;
import FacadePattern.exception.PaymentFailedException;
import FacadePattern.facade.OrderFacade;
import FacadePattern.model.Order;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class OrderFacadeTest {

    @Test
    public void testPlaceOrder_Success() throws PaymentFailedException, InventoryUnavailableException {
        Order order = new Order("123", "product1", 2, 100.0);
        OrderFacade orderFacade = new OrderFacade();
        assertDoesNotThrow(() -> orderFacade.placeOrder(order));
    }

    @Test
    public void testPlaceOrder_PaymentFailed() {
        Order order = new Order("123", "product1", 2, -100.0);
        OrderFacade orderFacade = new OrderFacade();
        assertThrows(PaymentFailedException.class, () -> orderFacade.placeOrder(order));
    }

    @Test
    public void testPlaceOrder_InventoryUnavailable() {
        // Assuming inventory check fails
        Order order = new Order("123", "product1", 2, 100.0);
        OrderFacade orderFacade = new OrderFacade();
        assertThrows(InventoryUnavailableException.class, () -> orderFacade.placeOrder(order));
    }
}

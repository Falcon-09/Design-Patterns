package FacadePattern.exception;

public class InventoryUnavailableException extends Exception{
    public InventoryUnavailableException(String message) {
        super(message);
    }
}

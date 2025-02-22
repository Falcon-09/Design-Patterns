package SimpleFactoryPattern.test;
import SimpleFactoryPattern.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotificationTest {
    @Test
    void testEmailNotification() {
        Notification notification = NotificationFactory.createNotification("email");
        assertTrue(notification instanceof EmailNotification, "Notification should be an EmailNotification.");
        notification.send("Test email notification.");
    }

    @Test
    void testSMSNotification() {
        Notification notification = NotificationFactory.createNotification("sms");
        assertTrue(notification instanceof SMSNotification, "Notification should be an SMSNotification.");
        notification.send("Test SMS notification.");
    }

    @Test
    void testPushNotification() {
        Notification notification = NotificationFactory.createNotification("push");
        assertTrue(notification instanceof PushNotification, "Notification should be a PushNotification.");
        notification.send("Test push notification.");
    }

    @Test
    void testInvalidNotificationType() {
        assertThrows(IllegalArgumentException.class, () -> {
            NotificationFactory.createNotification("invalid");
        }, "Unknown notification type should throw an exception.");
    }
}

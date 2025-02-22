package SimpleFactoryPattern;

public class Main {
    public static void main(String[] args) {
        // Create an email notification
        Notification emailNotification = NotificationFactory.createNotification("email");
        emailNotification.send("Hello, this is an email notification!");

        // Create an SMS notification
        Notification smsNotification = NotificationFactory.createNotification("sms");
        smsNotification.send("Hello, this is an SMS notification!");

        // Create a push notification
        Notification pushNotification = NotificationFactory.createNotification("push");
        pushNotification.send("Hello, this is a push notification!");
    }
}

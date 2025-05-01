package creational.factory;

public class SMSNotification implements Notification{
    @Override
    public boolean sendNotification(NotificationAttributes notificationAttributes) {
        System.out.println("Hello "+notificationAttributes.getTo()+" "+notificationAttributes.getSubject());
        return true;
    }
}

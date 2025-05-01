package creational.factory;

public class EmailNotification implements Notification{

    @Override
    public boolean sendNotification(NotificationAttributes notificationAttributes) {
        System.out.println("Hello "+notificationAttributes.getTo()+" "+notificationAttributes.getSubject());
        return true;
    }
}

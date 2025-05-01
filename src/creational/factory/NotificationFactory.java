package creational.factory;

import java.util.HashMap;
import java.util.Map;

public class NotificationFactory {

    private static final Map<NotificationType,Notification> factoryMap = new HashMap<>();

    static{
        factoryMap.put(NotificationType.EMAIL, new EmailNotification());
        factoryMap.put(NotificationType.SMS,new SMSNotification());
        factoryMap.put(NotificationType.APP,new PushNotification());
    }

    public static Notification getInstance(NotificationType notificationType){
        return factoryMap.get(notificationType);
    }
}

package creational.factory;

public class Driver {
    public static void main(String[] args) {
        Notification emailNotification = NotificationFactory.getInstance(NotificationType.EMAIL);
        NotificationAttributes emailAttributes = new NotificationAttributes("nihith@gmail.com","reddy@gmail.com","Your OTP is 123456 and valid for 10 mins");
        emailNotification.sendNotification(emailAttributes);

        Notification smsNotification = NotificationFactory.getInstance(NotificationType.SMS);
        NotificationAttributes smsAttributes = new NotificationAttributes("1234567890","0123456789","Your OTP is 123456 and valid for 10 mins");
        smsNotification.sendNotification(smsAttributes);

        Notification pushNotification = NotificationFactory.getInstance(NotificationType.APP);
        NotificationAttributes pushAttributes = new NotificationAttributes("Firebase","1234567890","Your OTP is 123456 and valid for 10 mins");
        pushNotification.sendNotification(pushAttributes);
    }
}

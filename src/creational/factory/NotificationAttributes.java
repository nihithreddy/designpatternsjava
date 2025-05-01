package creational.factory;

public class NotificationAttributes {
    private String from;
    private String to;
    private String subject;

    public NotificationAttributes(String from,String to,String subject){
        this.from = from;
        this.to = to;
        this.subject = subject;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }
}

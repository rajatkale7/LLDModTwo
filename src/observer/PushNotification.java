package observer;

public class PushNotification implements OrderPlaced{
    //This class is waiting to get the order placed.

    @Override
    public void orderPlacedEvent() {
        System.out.println("Send SMS Notification");
        System.out.println("Send email notification");

    }
}

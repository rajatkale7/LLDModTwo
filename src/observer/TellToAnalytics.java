package observer;

public class TellToAnalytics implements OrderPlaced{
    @Override
    public void orderPlacedEvent() {
        System.out.println("Hi Analytics, customer just placed order");
    }
}

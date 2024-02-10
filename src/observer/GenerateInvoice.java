package observer;

public class GenerateInvoice implements OrderPlaced{
    public void orderPlacedEvent() {
        System.out.println("Generate Invoice");
    }
}

package observer;

public class Main {
    public static void main(String[] args) {
        GenerateInvoice gen= new GenerateInvoice();
        PushNotification push= new PushNotification();
        Amazon a= new Amazon();
        a.addAfterOrderPlacedService(gen);
        a.addAfterOrderPlacedService(push);
        a.orderIsPlaced();
        System.out.println("------------------------------");

        //Let's say I want to remove invoice service. We can do from here itself
        //Means OCP is getting followed

        a.removeAfterOrderPlacedService(gen);
        a.orderIsPlaced();



    }
}

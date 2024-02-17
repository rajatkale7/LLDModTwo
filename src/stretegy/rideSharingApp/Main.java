package stretegy.rideSharingApp;

public class Main {
    public static void main(String[] args) {
        RideDetails r= new RideDetails(15,56);
        PricingManager pm= new PricingManager(PricingType.TIME_BASED);
        System.out.println("The fare will be "+pm.calculatePrice(r));
    }
}

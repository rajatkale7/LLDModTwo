package stretegy.rideSharingApp;

public class PricingManager {
    private PricingType pt;
    private PricingStrategy ps;

    public PricingManager(PricingType pt) {
        this.pt= pt;
    }

    public Double calculatePrice(RideDetails rideDetails) {
        ps = Factory.getStrategy(pt);
        return ps.ridePrice(rideDetails);
    }
}

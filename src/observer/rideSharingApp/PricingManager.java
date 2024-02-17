package observer.rideSharingApp;

public class PricingManager {
    private PricingType pt;
    private PricingStrategy ps;

    public PricingManager(PricingType pt, PricingStrategy ps) {
        this.pt= pt;
        this.ps=ps;
    }

    public Double calculatePrice(RideDetails rideDetails) {
        ps = Factory.getStrategy(pt);
        return ps.ridePrice(rideDetails);
    }
}

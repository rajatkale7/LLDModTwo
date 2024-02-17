package stretegy.rideSharingApp;

public interface PricingStrategy {
    public PricingType supportsType();
    public Double ridePrice(RideDetails r);
}

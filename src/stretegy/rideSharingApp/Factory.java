package stretegy.rideSharingApp;

public class Factory {
    public static PricingStrategy getStrategy(PricingType pricingType){
        return switch (pricingType) {
            case DISTANCE_BASED -> new DistanceBased();
            case TIME_BASED -> new TimeBased();
            case SURGE ->new  SurgeBased();
        };
    }
}

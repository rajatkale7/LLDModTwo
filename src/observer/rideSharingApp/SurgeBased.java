package observer.rideSharingApp;

public class SurgeBased implements PricingStrategy{
    public PricingType supportsType(){
        return PricingType.SURGE;
    }
    @Override
    public Double ridePrice(RideDetails r){   //This argument is lombok wala.
        return Constant.BASE_FARE * Constant.SURGE_MULTIPLIER;
    }
}

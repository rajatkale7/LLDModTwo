package observer.rideSharingApp;

public class DistanceBased implements PricingStrategy{
    public PricingType supportsType(){
        return PricingType.DISTANCE_BASED;
    }
    @Override
    public Double ridePrice(RideDetails r){   //This argument is lombok wala.
        return Constant.BASE_FARE + Constant.PER_KILOMETER_RATE * r.getDistance();
    }
}

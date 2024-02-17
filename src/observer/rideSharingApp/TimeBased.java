package observer.rideSharingApp;

public class TimeBased implements PricingStrategy{
    public PricingType supportsType(){
        return PricingType.TIME_BASED;
    }

    @Override
    public Double ridePrice(RideDetails r){   //This argument is lombok wala.
        return Constant.BASE_FARE + Constant.PER_MINUTE_RATE * r.getDuration();   //r.getDuration() is basically a getter and we don't see it because of the lombok
    }
}

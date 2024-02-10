package stretegyDesignPattern;

public class PathCalculatorFactory {   //This class generates objects.
    public static PathCalculator getPathCalculator(Mode mode){
        return switch (mode) {
            case CAR -> new CarPathCalculator();
            case BIKE -> new BikePathCalculator();
            case WALK -> new WalkPathCalculator();
            default -> null;
        };
        //Above switch case is from Lambda expression-Latest JAVA version

    }
}

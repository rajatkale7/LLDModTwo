package stretegy;

public class Maps {
    public void givePath(String source, String destination, Mode mode){
        PathCalculator pc= PathCalculatorFactory.getPathCalculator(mode);  //Method is static-->So,Class.method()
        //PathCalculatorFactory class is a house of objects.
        pc.findPath(source,destination);    //object.method
    }
}

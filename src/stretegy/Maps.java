package stretegy;

public class Maps {
    public void givePath(String source, String destination, Mode mode){
        PathCalculator pc= PathCalculatorFactory.getPathCalculator(mode);  //object will get created
        pc.findPath(source,destination);    //object.method
    }
}

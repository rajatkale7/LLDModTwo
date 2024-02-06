package decorator;

public class ChocoSyrup implements IceCream{
    private IceCream iceCream;
    public ChocoSyrup(IceCream iceCream){
        this.iceCream= iceCream;
    }

    public int getCost(){
        return iceCream.getCost()+23;
    }
    public String getDescription(){
        return iceCream.getDescription()+", ChocoSyrup";
    }
}

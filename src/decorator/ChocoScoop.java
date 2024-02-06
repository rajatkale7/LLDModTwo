package decorator;

public class ChocoScoop implements IceCream{
    private IceCream iceCream;
    public ChocoScoop(IceCream iceCream){
        this.iceCream= iceCream;
    }

    public int getCost(){
        return iceCream.getCost()+23;
    }
    public String getDescription(){
        return iceCream.getDescription()+", ChocoScoop";
    }
}

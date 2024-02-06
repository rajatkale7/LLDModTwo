package decorator;

public class VanillaScoop implements IceCream{
    private IceCream iceCream;
    public VanillaScoop(IceCream iceCream){
        this.iceCream= iceCream;
    }

    public int getCost(){
        return iceCream.getCost()+23;
    }
    public String getDescription(){
        return iceCream.getDescription()+", ChocoSyrup";
    }
}

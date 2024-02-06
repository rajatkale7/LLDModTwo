package decorator;

public class ChocoChip implements IceCream{
    private IceCream iceCream;
    public ChocoChip(IceCream iceCream){
        this.iceCream= iceCream;
    }

    public int getCost(){
        return iceCream.getCost()+23;
    }
    public String getDescription(){
        return iceCream.getDescription()+", Chocochip";
    }
}

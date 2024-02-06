package decorator;

public class ChocoCone implements IceCream{
    private IceCream iceCream;
    public ChocoCone(){
    }

    public ChocoCone(IceCream iceCream){
        this.iceCream=iceCream;
    }

    public int getCost(){
        if(iceCream != null) {
            return iceCream.getCost() + 20;
        } else {
            return 20;
        }
    }

    @Override
    public String getDescription() {
        if(iceCream != null) {
            return iceCream.getDescription() + ", extra Chocolate Cone";
        }
        else {
            return "Outer Chocolate Cone";
        }
    }
}

package observer;
import java.util.ArrayList;
import java.util.List;
public class Amazon {  //This is our publisher
    List<OrderPlaced> afterOrderPlacedServices;
    Amazon(){
        afterOrderPlacedServices= new ArrayList<>();
    }

    public void orderIsPlaced(){
        for(OrderPlaced o: afterOrderPlacedServices){
            o.orderPlacedEvent();   //List stores the classes. So, class.method()
        }
    }
    public void addAfterOrderPlacedService(OrderPlaced o){
        afterOrderPlacedServices.add(o);
    }
    public void removeAfterOrderPlacedService(OrderPlaced name){
        afterOrderPlacedServices.remove(name);
        //special type of remove() for object as input instead of index
    }
}

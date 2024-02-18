package observer.youTubeSystem;
import java.util.ArrayList;
import java.util.List;

public class PublisherTwo implements Publisher{
    List<Observer> pubTwoList;

    public PublisherTwo() {
        this.pubTwoList = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer o) {
        pubTwoList.add(o);
    }

    @Override
    public void unSubscribe(Observer o) {
        pubTwoList.remove(o);

    }

    @Override
    public void notifyAllFromList(String s) {
        for(Observer x:pubTwoList){
            x.update("-->"+s);
        }
    }

    public void newVideoUpload(String msg){
        notifyAllFromList(msg);
    }
}

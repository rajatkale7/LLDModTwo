package observer.youTubeSystem;
import java.util.ArrayList;
import java.util.List;
public class PublisherOne implements Publisher{
    List<Observer> pubOneList;

    public PublisherOne() {
        this.pubOneList = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer o) {
        pubOneList.add(o);
    }

    @Override
    public void unSubscribe(Observer o) {
        pubOneList.remove(o);

    }

    @Override
    public void notifyAllFromList(String s) {
        for(Observer x:pubOneList){
            x.update("-->"+s);
        }
    }

    public void newVideoUpload(String msg){
        notifyAllFromList(msg);
    }
}

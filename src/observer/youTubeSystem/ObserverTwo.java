package observer.youTubeSystem;

public class ObserverTwo implements Observer{
    @Override
    public void update(String message) {
        System.out.println("This is observer two"+ message);
    }
}

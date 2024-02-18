package observer.youTubeSystem;

public class ObserverOne implements Observer{
    @Override
    public void update(String message) {
        System.out.println("This is observer one"+ message);
    }
}

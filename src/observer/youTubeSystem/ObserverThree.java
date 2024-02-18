package observer.youTubeSystem;

public class ObserverThree implements Observer{
    @Override
    public void update(String message) {
        System.out.println("This is observer three"+ message);
    }
}

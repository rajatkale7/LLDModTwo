package observer.youTubeSystem;

public interface Publisher {
    public void subscribe(Observer o);
    public void unSubscribe(Observer o);
    public void notifyAllFromList();
}

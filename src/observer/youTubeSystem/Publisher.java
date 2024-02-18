package observer.youTubeSystem;

public interface Publisher {  //This is a youtube channel
    public void subscribe(Observer o);
    public void unSubscribe(Observer o);
    public void notifyAllFromList();
}

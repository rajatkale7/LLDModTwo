package observer.youTubeSystem;
public class Main {
    public static void main(String[] args) {
        PublisherOne one=new PublisherOne();
        PublisherTwo two= new PublisherTwo();
        //Above two are the channels

        ObserverOne user1= new ObserverOne();
        ObserverTwo user2= new ObserverTwo();
        ObserverThree user3= new ObserverThree();

        //Let is now subscribe
        one.subscribe(user1);
        one.subscribe(user2);
        one.subscribe(user3);
        two.subscribe(user1);
        one.newVideoUpload("channel one video 1");
        two.newVideoUpload("channel two video 1");

        one.unSubscribe(user3);

        System.out.println("-----------");
        one.newVideoUpload("channel one video 2");
    }
}

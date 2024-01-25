package singleton;

public class SingletonAdv {
    private static SingletonAdv instance;
    private SingletonAdv(){ //This is the constructor
    }
    public static SingletonAdv getInstance(){
        if(instance == null){
            synchronized (SingletonAdv.class){   //This will allow only one thread to enter at a time
                if(instance == null){
                    instance = new SingletonAdv();
                }
            }
        }
        return instance;
    }
}
/* If many threads arrive at if(instance==null), synchronized block will allow only one
to enter inside. This check is known as Double lock checking.
 */
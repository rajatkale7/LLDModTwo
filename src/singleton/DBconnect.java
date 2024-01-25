package singleton;

public class DBconnect {
    private int noOfConn=0;  //current number of the connections that has established
    private final int limit=10;  //limit of the connections
    private static DBconnect instance;
    private DBconnect(){ //empty constructor
    }
    public static DBconnect getDBconnectObject(){
        if(instance==null){
            instance=new DBconnect();
        }
        return instance;
    }

    public boolean connect(){
        if(noOfConn<limit){
            noOfConn++;
            return true;
        }
        else{
            return false;
        }
    }

}

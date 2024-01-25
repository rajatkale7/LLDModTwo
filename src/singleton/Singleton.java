package singleton;

public class Singleton {
    private static Singleton instance;
    private Singleton(){
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

/*This is one of the solutions of the singleton class. but imagine if 2 or more threads
comes to if(instance==null) it will get true and two objects will get created
so this solution is correct but not thread safe. not good from multithreading POV
Let's modify the solution.
Please refer SingletonAdv.java class in the same package
*/
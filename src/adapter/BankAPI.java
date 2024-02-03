package adapter;

public interface BankAPI {
    //Contains what do I need from my bank from phonpe POV.
    //Means basic functionalities which phonpe want from thirdparty(Bank)
    double checkBalance(User user);
    int doTransaction(User from, User to, double amount);
    boolean changePin(User user, int currentPin, int newPin);
}

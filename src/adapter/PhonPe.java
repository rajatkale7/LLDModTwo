package adapter;

public class PhonPe {
    //Write code as per BankAPI adapter.
    private BankAPI bankAPI;

    public PhonPe() {
        this.bankAPI = new YesBankAPIAdapter();  //upcasting. bankAPI is the parent
        //OR
    }

    public void checkBalance(User user){
        double b= bankAPI.checkBalance(user);
        System.out.println("Balance is- "+b);
    }

    public void transferMoney(User fromUser, User toUser, double amount){
        if(BankAPI.checkBalance(fromUser)<amount){
            System.out.println("Transaction failed");
        }
        int status= BankAPI.doTransaction(fromUser,toUser,amount);
        switch(status){
            case 1:
                System.out.println("success");
                break;
            case 0:
                System.out.println("Failed");
                break;
            default:
                System.out.println("In progress");
                break;
        }

    }


}

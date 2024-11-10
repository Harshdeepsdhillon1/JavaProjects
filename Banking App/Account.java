import java.util.ArrayList;

public class Account {
    private String name;
    //name of the account
    private double balance;
    //balance of the account
    private String uuid;
    //Account ID number
    private User holder;
    //The user object that owns this account
    private ArrayList<Transaction> transactions;
    //list of transactions of this account
    public Account (String name, User holder, Bank theBank){
        //set the name and holder
        this.name = name;
        this.holder = holder;

        //get the account UUID
        this.uuid = theBank.getNewAccountUUID();

        //initialize the transactions to emply arraylist
        this.transactions = new ArrayList<Transaction>();



    }
    public String getUUID(){
        return this.uuid;
    }
}

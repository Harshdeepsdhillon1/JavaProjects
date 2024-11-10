import java.util.Date;
public class Transaction {
    private double amount;
    //amount in this transaction
    private Date timestamp;
    //time & date of this transaction
    private String memo;
    //a memo for this transaction
    private Account inAccount;
    //the account in which transaction was formed

    /**
     * Create a new transaction
     * @param amount is the amount transacted
     * @param inAccount is the account the user belongs to
     */
    public Transaction(double amount, Account inAccount){
        this.amount = amount;
        this.inAccount = inAccount;
        this.timestamp = new Date();
        this.memo = "";
    }

    /**
     * @param memo the memo for the transaction
     */
    public Transaction(double amount, String memo, Account inAccount){
        //Call the two-org constructor first
        this(amount, inAccount);
        //Then set the memo
        this.memo = memo;
    }

}

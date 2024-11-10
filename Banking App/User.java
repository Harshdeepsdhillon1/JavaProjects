import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.security.MessageDigest;

public class User {
    private String firstname;
    private String lastname;
    private String uuid;
    // Unique universal ID
    private byte pinHash[];
    //MD5 hash of user's pin
    private ArrayList<Account> accounts;
    //list of accounts for user
    /*
    firstname is user's first name
    lastname is user's last name
    pin user's account number pin
    theBank object user's Bank object that belong to
    */

    public User(String firstname, String lastname, String pin, Bank theBank){
        //Set user's  name
        this.firstname = firstname;
        this.lastname = lastname;

        //Store pin's MD5 hash, rather than the original value for security reasons

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            this.pinHash = md.digest(pin.getBytes());//Getting bytes from pinHash and digest
        } catch (NoSuchAlgorithmException e){
            System.err.println("Error, caught NoSuchAlgorithmException");
            e.printStackTrace();
            System.exit(1);

            //get a new, unique universal ID for the user
            this.uuid = theBank.getNewUserUUID();

            //create empty list of accounts
            this.accounts = new ArrayList<Account>();

            //print log message
            System.out.printf("New user %s, %s with ID %s created", lastname, firstname, this.uuid);
        }
    }
    //add an account for the user
    public void addAccount(Account anAcct){
        this.accounts.add(anAcct);
    }
    public String getUUID(){
        return this.uuid;
    }

    public boolean validatePin(String aPin){
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            return MessageDigest.isEqual(md.digest(aPin.getBytes()), this.pinHash);
        } catch (NoSuchAlgorithmException e){
            System.err.println("Error, caught NoSuchAlgorithmException");
            e.printStackTrace();
            System.exit(1);
        }
        return false;
    }
}

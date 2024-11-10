import java.util.ArrayList;
import java.util.Random;


public class Bank {
    private String name;
    //
    private ArrayList<User> users;
    private ArrayList<Account> accounts;

    //Create a Bank constructor with empty lists of users and accounts & name of the banke
    public Bank(String name){
        this.name = name;
        this.users = new ArrayList<User>();
        this.accounts = new ArrayList<Account>();
    }

    public String getNewUserUUID(){
        //initialization
        String uuid;
        Random rng = new Random();
        int len = 6;
        boolean nonUnique = false;
        //Continue looping until we get a new Unique ID
        do {
            //Generate the number
            uuid = "";
            for (int c= 0; c<len; c++){
                uuid += ((Integer)rng.nextInt(10)).toString(); //Generate a new int withing number 10
                //And converting it into String
                
                //Making sure its unique
                for (Account a: this.accounts) {
                    if(uuid.compareTo(a.getUUID()) == 0){
                        nonUnique = true;
                        break;
                        //If UUID is same to another user, then break
                    };
                }

            }
        }while (nonUnique);

        return uuid;
    }
    public String getNewAccountUUID(){
        //initialization
        String uuid;
        Random rng = new Random();
        int len = 6;
        boolean nonUnique = false;
        //Continue looping until we get a new Unique ID
        do {
            //Generate the number
            uuid = "";
            for (int c= 0; c<len; c++){
                uuid += ((Integer)rng.nextInt(10)).toString(); //Generate a new int withing number 10
                //And converting it into String

                //Making sure its unique
                for (User u: this.users) {
                    if(uuid.compareTo(u.getUUID()) == 0){
                        nonUnique = true;
                        break;
                        //If UUID is same to another user, then break
                    };
                }

            }
        }while (nonUnique);

        return uuid;
    }

    public void addAccount(Account anAcct){
        this.accounts.add(anAcct);
    }

    /**
     *
     * @param firstname
     * @param lastname
     * @param pin
     * @return
     */
    public User addUser(String firstname, String lastname, String pin){
        //Create a user object and it to our list
        User newUser = new User(firstname, lastname, pin, this);
        this.users.add(newUser);

        //Create a savings account and add it to the Bank accounts list
        Account newAccount = new Account("Savings", newUser, this);
        //add to holder and bank lists
        newUser.addAccount(newAccount);
        this.accounts.add(newAccount);

        return newUser;
    }



    public User userLogin(String userID, String pin){
        //Search through the list pf the users
        for (User u: this.users){
            //Check user ID is correct
            if (u.getUUID().compareTo(userID) == 0 && u.validatePin(pin)){
                return u;
            }
        }
        //If we have not found the user or pin is incorrect
        return null;
    }

}

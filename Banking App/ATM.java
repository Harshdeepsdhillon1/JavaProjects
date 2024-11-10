import java.util.Scanner;
public class ATM {
    public static void main(String [] args){
        //initialize Scanner
        Scanner sc = new Scanner(System.in);

        //init Bank
        Bank theBank = new Bank("Punjab National Bank");

        //add a user to a bank and create a savings account
        User aUser = theBank.addUser("Harshdeep", "Dhillon", "2004");

        //add a checking account
        Account newAccount = new Account("Checking", aUser, theBank);
        aUser.addAccount(newAccount);
        theBank.addAccount(newAccount);


    }
}

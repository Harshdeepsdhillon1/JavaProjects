package harshdeepsingh_sec002_ex01;


import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountTest {
    public static void main(String[] args) {
        //Giving account an initial balance
        Account account = new Account(1000);
        ArrayList<Transaction> transactions = new ArrayList<>();
        //Adding on some test cases to withdraw and deposit some amount
        transactions.add(new Transaction(account, 500, true));
        transactions.add(new Transaction(account, 300, false));
        transactions.add(new Transaction(account, 700, true));
        transactions.add(new Transaction(account, 3000, false));

        ExecutorService executorService = Executors.newFixedThreadPool(transactions.size());
        for (Transaction transaction : transactions) {
            executorService.execute(transaction);
        }
        executorService.shutdown();
    }
}
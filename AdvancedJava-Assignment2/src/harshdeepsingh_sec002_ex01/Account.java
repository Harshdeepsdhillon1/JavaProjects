package harshdeepsingh_sec002_ex01;


class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    //creating a function to deposit, to add the new balance to existing amount
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". New balance: " + balance);
    }

    //creating a function to withdraw, to subtract the new balance to existing amount
    //only if there is sufficient balance
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Cannot withdraw " + amount);
        }
    }
}

class Transaction implements Runnable {
    private Account account;
    private int amount;
    private boolean isDeposit;

    public Transaction(Account account, int amount, boolean isDeposit) {
        this.account = account;
        this.amount = amount;
        this.isDeposit = isDeposit;
    }

    @Override
    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}


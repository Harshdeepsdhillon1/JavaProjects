public class Main {
    public static void main(String[] args) {
        // Create a bank account
        BankAccount account = new BankAccount("12345", "John Doe", 1000.0);

        // Create a customer with the bank account
        Customer customer = new Customer("John Doe", account);

        // Perform transactions
        customer.getAccount().deposit(500.0);
        customer.getAccount().withdraw(200.0);

        // Display balance
        System.out.println("Customer: " + customer.getName());
        System.out.println("Account Number: " + customer.getAccount().getAccountNumber());
        System.out.println("Balance: $" + customer.getAccount().getBalance());
    }
}

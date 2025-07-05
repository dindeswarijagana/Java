
public class BankAccount {

    private final String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("withdrawl amount must be greater than 0");
        }
        if(amount > this.balance) {
            throw new IllegalArgumentException("Insufficient Balance");
        }

        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if(amount <= 0 ) {
            throw new IllegalArgumentException("deposit amount should be greater than 0");
        }
        this.balance += amount;
    }
}


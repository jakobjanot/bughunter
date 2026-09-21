public class BankAccount {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }
}
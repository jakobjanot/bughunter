void main() {
    BankAccount account = new BankAccount(1000);

    account.withdraw(1200);
    account.deposit(100);

    IO.println(account.balance);
}
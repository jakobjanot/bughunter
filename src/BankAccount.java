public static void main(String[] args) {
    bankclass account = new bankclass(1000);

    account.withdraw(1200); // Fejler: Ikke nok dækning
    account.deposit(100);   // Indsætter 100

    IO.println("Nuværende saldo: " + account.getBalance()); // Printer 1100.0
}
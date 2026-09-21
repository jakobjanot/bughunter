/* Skriv en klasse til at håndtere bankkonti */

double balance = 0;

void main() {
    withdraw(69);
    deposit(420);
    IO.println(balance);
}

void withdraw(double amount) {
    balance = balance - amount;
}

void deposit(double amount) {
    balance = balance + amount;
}

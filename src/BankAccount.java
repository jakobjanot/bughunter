/* Skriv en klasse til at håndtere bankkonti */

double balance = 6969;

void main() {
    withdraw(420);
    deposit(69);
    IO.println(balance);
}

void withdraw(double amount) {
    balance = balance - amount;
}

void deposit(double amount) {
    balance = balance + amount;
}

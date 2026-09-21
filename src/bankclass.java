public class bankclass {
        private double balance;

        // Konstruktør til at oprette en konto med en startsaldo
        public bankclass(double initialBalance) {
            if (initialBalance >= 0) {
                this.balance = initialBalance;
            } else {
                this.balance = 0;
                System.out.println("Startsaldo kan ikke være negativ. Sæt til 0.");
            }
        }

        // Metode til at hæve penge
        public boolean withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Beloebet der hæves skal være positivt.");
                return false;
            }
            if (amount > balance) {
                System.out.println("Ikke nok dækning på kontoen.");
                return false;
            }
            balance -= amount;
            return true;
        }

        // Metode til at indsætte penge
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            } else {
                System.out.println("Beloebet der indsættes skal være positivt.");
            }
        }

        // Getter til at aflæse balancen
        public double getBalance() {
            return balance;
        }

}

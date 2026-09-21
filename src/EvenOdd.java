/* Find fejlen i isOdd-metoden */

void main() {
    IO.println("Tallet 3 er ulige: " + isOdd(3));
    IO.println("Tallet 4 er lige: " + isOdd(4));
}

boolean isOdd(int number) {
    return number % 2 == 1;
}

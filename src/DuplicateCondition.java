/* Refaktorer koden for at fjerne duplikerede if-betingelser */

void main() {
    int age = 17;

    if (age >= 18) {
        IO.println("Can vote");
        IO.println("Can Drive");
        IO.println("Is an adult");
    } else {
        IO.println("du kan intet");
    }
}

/* Refaktorer koden for at fjerne duplikerede if-betingelser */

void main() {
    int age = 25;
IO.println("is "+age+" years old");
    if (age >= 18) {
        IO.println("Can vote");
        IO.println("Is an adult");
        IO.println("Can drive");
    }else {
        IO.println("Cant vote");
        IO.println("Is not an adult");
        IO.println("Can not legaly drive");
    }
}

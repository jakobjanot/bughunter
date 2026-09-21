/* isPositive(...) virker, men kan simplificeres lidt */

void main() {
    IO.println(isPositive(-5));
}

boolean isPositive(int number) {
    if (number >= 0) {
        return true;
    }
    return false;
}
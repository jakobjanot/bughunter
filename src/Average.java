/* Find ud hvordan vi håndterer tomme lister */

void main() {
    IO.println("Gennemsnittet af 1, 2, 3, 4, 5 er: " 
        + calculateAverage(new int[]{1, 2, 3, 4, 5}));
    IO.println("Gennemsnittet af en tom liste er: " 
        + calculateAverage(new int[]{}));
}

double calculateAverage(int[] numbers) {
    if (numbers.length == 0) {
        return 0.0;
    }
    int sum = 0;

    for (int number : numbers) {
        sum += number;
    }

    return (double) sum / numbers.length;
}

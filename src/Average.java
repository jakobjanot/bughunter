/* Find out how we handle empty lists */

void main() {
    IO.println("The average of 1, 2, 3, 4, 5 is: "
        + calculateAverage(new int[]{1, 2, 3, 4, 5}));
    IO.println("Average of the empty list is: "
        + calculateAverage(new int[]{}));
}

//double calculateAverage(int[] numbers) {
//    int sum = 0;
//
//    for (int number : numbers) {
//        sum += number;
//    }
//
//    return  sum / numbers.length;
double calculateAverage(int[] numbers) {
    if (numbers.length == 0) {
        return 0;
    }

    int sum = 0;

    for (int number : numbers) {
        sum += number;
    }

    return (double) sum / numbers.length;
}



package task.top20tasks;

public class PrimeNumbers {
    public static void main(String[] args) {

        primeNumbersTo997Table();
        System.out.println();
        isPrimeNumber(39);
    }

    private static void isPrimeNumber(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        if (count > 2)
            System.out.println(number + " is not a prime number");
        else System.out.println(number + " is a prime number");
    }

    private static void primeNumbersTo997Table() {
        int numberCount = 0;
        for (int i = 0; i < 998; i++) {
            if (i == 2 || i == 1) {
                System.out.print(i + " ");
                numberCount++;
                continue;
            }
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                System.out.print(i + " ");
                numberCount++;
            }
            if (numberCount == 12) {
                System.out.println();
                numberCount = 0;
            }
        }
    }
}

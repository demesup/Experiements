import algorithmsAndDataStructures.Fibonacci;

import java.util.Arrays;

public class Time {
    static Fibonacci fibonacci = new Fibonacci();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);
    }

    private static void method() {
        for (int i = 1; i < 50; i++) {
            int n = i * 100;
            long[] m = new long[n + 1];
            Arrays.fill(m, -1);
            long number = fibonacci.fibNaive(n, m);
            System.out.println(number);
        }
    }
}

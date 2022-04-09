public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(fibNaive(2));
        System.out.println(fibNaive(5));

        System.out.println(fibEffective(1000));


    }

    private static long fibNaive(int n) {
        if (n == 0 | n == 1) return n;
        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    private static long fibEffective(int n) {
        long[] array = new long[n + 1];
        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        return array[n];
    }


}

package top20tasks;

import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacciCalculate(10));
    }

    private static ArrayList<Integer> fibonacciCalculate(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 2; i <= number; i++) {
            list.add(list.get(i - 1) + list.get(i - 2));
        }
        return list;
    }
}

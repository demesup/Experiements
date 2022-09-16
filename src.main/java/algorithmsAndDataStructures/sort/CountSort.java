package algorithmsAndDataStructures.sort;

import java.util.Arrays;

import static algorithmsAndDataStructures.sort.BubbleSort.createArray;
import static algorithmsAndDataStructures.sort.QuickSort.quickSort;

public class CountSort {
    public static void main(String[] args) {
        int[] array = createArray();
        System.out.println(Arrays.toString(array));
        countSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void countSort(int[] array) {
        final int MAX_VALUE = 100;

        int[] count = new int[MAX_VALUE];

        for (int k : array) {
            count[k] = count[k] + 1;
        }

        int arrayIndex = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                array[arrayIndex] = i;
                arrayIndex++;
            }
        }
    }

    private static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("Затраченное время: " + elapsed + " ms");
    }

    private static void test() {
        int testLen = 100000000;

        int[] arr1 = new int[testLen];
        int[] arr2 = new int[testLen];

        System.out.println("---Сравнение быстрой сортировки и сортировки подсчетом---");

        for (int i = 0; i < testLen; i++) {
            arr2[i] = arr1[i] = (int)Math.round(Math.random() * 99);
        }

        System.out.println("Быстрая сортировка:");
        measureTime(() -> quickSort(arr1, 0, testLen - 1));

        System.out.println("Сортировка подсчетом:");
        measureTime(() -> countSort(arr2));
    }
}
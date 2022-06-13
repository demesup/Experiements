package algorithmsAndDataStructures.sort;

import java.util.Arrays;
import java.util.Random;

import static algorithmsAndDataStructures.sort.BubbleSort.createArray;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = createArray();
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }

    private static void selectionSort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = j; i < array.length; i++) {
                if (array[i] < array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
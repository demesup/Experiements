package algorithmsAndDataStructures.sort;


import java.util.Arrays;

import static algorithmsAndDataStructures.sort.BubbleSort.createArray;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = createArray();
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int from, int to) {
        if (from < to) {
            int right = to;
            int left = from;

            int pivot = array[from + (to - from) / 2];
            while (left <= right) {
                while (array[left] < pivot) left++;
                while (array[right] > pivot) right--;
                if (left <= right) {
                    swap(array, left, right);
                    left++;
                    right--;
                }
            }
            quickSort(array, 0, left - 1);
            quickSort(array, left, to);
        }
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
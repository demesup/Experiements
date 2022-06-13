package algorithmsAndDataStructures;

import java.util.Arrays;

public class MinMaxElement {
    public static void main(String[] args) {
        int[] array = {6, 8, 9, 1, 7, 3, 4, 0, 5};
        minElement(array);
        maxElement(array);
    }

    private static void minElement(int[] array) {
        System.out.println(Arrays.toString(array));

        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        System.out.println("Index: " + index + " element= " + min);
    }

    private static void maxElement(int[] array) {
        System.out.println(Arrays.toString(array));

        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("Index: " + index + " element= " + max);
    }
}

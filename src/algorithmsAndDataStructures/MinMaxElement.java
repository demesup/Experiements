package algorithmsAndDataStructures;

import java.util.Arrays;

public class MinMaxElement {
    public static void main(String[] args) {
        int[] array = {6, 8, 9, 1, 7, 3, 4, 0, 5};
        minElement(array);
        maxElement(array);

        secondMinElement(array);
    }

    private static void secondMinElement(int[] array) {
        if (array.length == 0) {
            System.out.println("Length = 0");
            return;
        }
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                secondMin = min;
                min = array[i];
            } else if (array[i] < secondMin && array[i] != min) {
                secondMin = array[i];
            }
        }

        if (secondMin == Integer.MAX_VALUE){
            System.out.println("There is no second min element");
        } else {
            System.out.println("Second min element: " + secondMin);
        }
        System.out.println("Min element: " + min);
    }

    private static int minElement(int[] array) {
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
        return min;
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

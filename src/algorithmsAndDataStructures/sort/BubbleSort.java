package algorithmsAndDataStructures.sort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = createArray();

        System.out.println(Arrays.toString(array));
        array = bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] createArray() {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(25);
        }
        return array;
    }

    private static int[] bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted= false;
                }
            }
        }


        return array;
    }
}
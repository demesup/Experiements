package algorithmsAndDataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(500);
        }

        System.out.println(Arrays.toString(array));


        int number = random.nextInt(500);
        System.out.println(findNumber(number , array));
    }

    private static int findNumber(int number, int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(number);

        int middle = array.length / 2;
        int start = 0;
        int end = array.length - 1;

        ArrayList<Integer> list =new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        System.out.println(list.indexOf(number));


        while (middle > start && middle < end) {
            if (number == array[middle]) return middle;
            if (number > array[middle]) {
                start = middle;
            } else {
                end = middle;
            }
            middle = (end + start) / 2;

        }

        return -1;
    }
}

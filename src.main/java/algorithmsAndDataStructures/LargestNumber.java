package algorithmsAndDataStructures;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 7, 9, 9, 5, 6, 8, 9, 4, 5};

        System.out.println(Arrays.toString(theLargestNumber(numbers)));
        System.out.println(maxNumber(numbers));

    }

    private static String maxNumber(int[] numbers) {
        Arrays.sort(numbers);
        StringBuilder numbersStr = new StringBuilder();
        for (int i = numbers.length-1; i >= 0 ; i--) {
            numbersStr.append(numbers[i]);
        }
        return numbersStr.toString();
    }

    private static int[] theLargestNumber(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }
}

package algorithmsAndDataStructures.search;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSearch {


    public static void main(String[] args) {
        String test1 = "aabaabaaaaaabaabaabaabbaab";
        String test2 = "aabaab";

        System.out.println(searchNaive(test1, test2));
        System.out.println(Arrays.toString(prefixFunction(test2)));
        System.out.println(KMPSearch(test1, test2));
    }

    static ArrayList<Integer> KMPSearch(String text, String passage) {
        ArrayList<Integer> findPosition = new ArrayList<>();
        int[] prefixFunction = prefixFunction(passage);

        int i = 0;
        int j = 0;

        while (i < text.length()) {
            if (passage.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == passage.length()) {
                findPosition.add(i - j);
                j = prefixFunction[j - 1];
            } else if (i < text.length() && passage.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = prefixFunction[j - 1];
                } else {
                    i++;
                }
            }
        }

        return findPosition;
    }


    static int[] prefixFunction(String passage) {
        int[] values = new int[passage.length()];
        int x = 0;
        for (int i = 1; i < passage.length(); i++) {
            int j = 0;
            while (i + j < passage.length() && passage.charAt(j) == passage.charAt(i + j)) {
                values[i + j] = Math.max(values[i + j], j + 1);
                j++;
            }
        }
        return values;
    }

    static ArrayList<Integer> searchNaive(String text, String passage) {
        ArrayList<Integer> findPosition = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            int j = 0;
            while (j < passage.length() && j + i < text.length() && passage.charAt(j) == text.charAt(j + i)) {
                j++;
            }
            if (j == passage.length()) findPosition.add(i);
        }
        return findPosition;
    }
}

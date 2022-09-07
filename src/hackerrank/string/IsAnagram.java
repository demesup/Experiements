package hackerrank.string;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class IsAnagram {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        char[] charsA = sortedArray(a.toLowerCase().toCharArray());
        char[] charsB = sortedArray(b.toLowerCase().toCharArray());

        return compare(charsA,charsB);
    }

    private static boolean compare(char[] charsA, char[] charsB) {
        for (int i = 0; i < charsA.length; i++) {
            if (charsA[i] != charsB[i]) return false;
        }
        return true;
    }

    static char[] sortedArray(char[] array){
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            char current = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > current) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }

        return array;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
        scan.close();

        var a = "hello";
        var b = "HELlo";
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}

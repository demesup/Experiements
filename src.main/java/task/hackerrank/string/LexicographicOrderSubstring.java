package task.hackerrank.string;

import java.io.IOException;
import java.util.Scanner;

public class LexicographicOrderSubstring {
    public static String getSmallestAndLargest(String s, int k) {
        if (k >= s.length()) return s + "\n" + s;

        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = s.substring(0, k);
        largest = s.substring(0, k);
        for (int i = 1; i < s.length() - k + 1; i++) {
            String substring = s.substring(i, k + i);
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            } else if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        StringBuilder builder = new StringBuilder(s).reverse();
        if (s.equals(builder.toString())){
            System.out.println("Yes");
        } else System.out.println("No");

        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}

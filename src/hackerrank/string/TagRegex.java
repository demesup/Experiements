package hackerrank.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagRegex {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            boolean matchfound = false;

            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");

            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                matchfound = true;
            }
            if (!matchfound) {
                System.out.println("None");
            }
            //Write your code here

            testCases--;
        }
    }
}

package algorithmsAndDataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Parser {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String i;
        while (!(i = scanner.readLine()).isEmpty()) {
            System.out.println(parse(i));
        }
    }

    private static String parse(String str) {
        //for numbers ...0.01, 0.1, 10, 100...
        if (Pattern.compile("^(?:(?!\\.)0\\.0*1|10*)$").matcher(str).matches()) return str;
        try {
            Integer.parseInt(str);
            return "1" + str.replaceAll("\\d", "0");
        } catch (Exception i) {
            try {
                Float.parseFloat(str);
                if (str.length() == 3) return "1";
                return str.substring(0, str.lastIndexOf("0")).replaceAll("\\d", "0") + "1";
            } catch (Exception e) {
                return "Wrong number";
            }
        }
    }

}

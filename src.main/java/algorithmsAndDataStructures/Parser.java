package algorithmsAndDataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.MathContext;
import java.util.regex.Pattern;

import static java.lang.Math.ceil;
import static java.lang.Math.log10;

public class Parser {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String i;
        while (!(i = scanner.readLine()).isEmpty()) {
//            System.out.println(parse(i));

            System.out.println(getAnInt(i));
        }
    }

    private static Number getAnInt(String s) {
        var x = Float.parseFloat(s);
        return ceil(log10(x));
    }

    public static String parse(String str) {
        str= str.replaceAll(" ","");
        //for numbers ...0.01, 0.1, 10, 100...
        if (Pattern.compile("^(?:(?!\\.)0\\.0*1|10*)$").matcher(str).matches() || str.equals("0")){
            return str;
        }
        if (Pattern.compile("^\\d*$").matcher(str).matches()){
            return "1" + str.replaceAll("\\d", "0");
        }
        if (Pattern.compile("^[1-9]*\\.\\d*$").matcher(str).matches()) {
            return  "1" + str.substring(0,str.indexOf(".")).replaceAll("\\d", "0");
        }
        if (Pattern.compile("^0\\.\\d*$").matcher(str).matches()) {
            if (str.length() == 3) return "1";
            return str.substring(0, str.lastIndexOf("0")).replaceAll("\\d", "0") + "1";
        }
                return "Wrong number";
    }
}

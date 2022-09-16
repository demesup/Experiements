package task.hackerrank.string;

import java.util.ArrayList;
import java.util.List;

public class StringTokens {
    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?";

        splitToTokens(s);
    }

    private static void splitToTokens(String s) {
        String[] tokens = s.split("[?._\\s'!@,]");
        List<String> tokensWithoutNull = new ArrayList<>();
        for (String token : tokens) {
            if (token.length() != 0)
                tokensWithoutNull.add(token);
        }

        System.out.println(tokensWithoutNull.size());
        tokensWithoutNull.forEach(System.out::println);
    }
}

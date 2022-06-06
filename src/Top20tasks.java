import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Top20tasks {
    public static void main(String[] args) {
        reversedString();

        reversedCharacters1();
        reversedCharacters2();

        changeVariablesWithThird();
        changeVariablesWithoutThird();

        wordCountHashMap();
        hashMapIteration();

        isPrimeNumber();


    }

    private static void isPrimeNumber() {
        int numberCount = 0;
        for (int i = 0; i < 998; i++) {
            if (i == 2 || i == 1) {
                System.out.print(i + " ");
                numberCount++;
                continue;
            }
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                System.out.print(i + " ");
                numberCount++;
            }
            if (numberCount == 12) {
                System.out.println();
                numberCount = 0;
            }

        }
    }

    private static void hashMapIteration() {
        HashMap<Integer, String> map = new HashMap();
        map.put(1, "hello");
        map.put(2, "how");
        map.put(3, "are");
        map.put(4, "ypu");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry current = (Map.Entry) iterator.next();
            System.out.println("Key = " + current.getKey() + "; value = " + current.getValue());
        }

        for (Map.Entry current : map.entrySet()) {
            System.out.println("Key = " + current.getKey() + "; value = " + current.getValue());
        }
    }

    private static void wordCountHashMap() {
        String str = "My name is Sonya and what is your name ?";
        String[] strings = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {
                int count = map.get(strings[i]);
                map.put(strings[i], count + 1);
            } else {
                map.put(strings[i], 1);
            }
        }
        System.out.println(map);
    }

    private static void changeVariablesWithoutThird() {
        int a = 6;
        int b = 10;
        System.out.println(a + " " + b);

        a += b;
        b = a - b;
        a -= b;
        System.out.println(a + " " + b);
    }

    private static void changeVariablesWithThird() {
        int a = 6;
        int b = 10;
        System.out.println(a + " " + b);

        int c = a;
        a = b;
        b = c;
        System.out.println(a + " " + b);
    }

    private static void reversedCharacters2() {
        String str = "!@#$%^&*()_+";
        String[] str1 = str.split("");
        for (int i = str1.length - 1; i >= 0; i--) {
            System.out.print(str1[i]);
        }
        System.out.println();
    }

    private static void reversedCharacters1() {
        String str = "!@#$%^&*()_+";
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i > -1; i--) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }

    private static void reversedString() {
        String str = "Hello! You need to reverse me)";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        System.out.println(stringBuilder.reverse());
    }
}

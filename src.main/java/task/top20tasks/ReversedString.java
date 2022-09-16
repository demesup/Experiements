package task.top20tasks;

public class ReversedString {
    public static void main(String[] args) {
        reversedString("Hello! You need to reverse me)");
        reversedCharacters1("!@#$%^&*()_+");
        reversedCharacters2( "!@#$%^&*()_+");
    }

    private static void reversedCharacters2(String str) {
        String[] str1 = str.split("");
        for (int i = str1.length - 1; i >= 0; i--) {
            System.out.print(str1[i]);
        }
        System.out.println();
    }

    private static void reversedCharacters1(String str) {
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i > -1; i--) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }

    private static void reversedString(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        System.out.println(stringBuilder.reverse());
    }
}

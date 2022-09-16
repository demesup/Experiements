package task.top20tasks;

public class Palindrome {
    public static void main(String[] args) {

        String str1 = "I`m not a palindrome";
        String str2 = "taco cat";

        System.out.println(str1 + " " + isPalindrome(str1));
        System.out.println(str2 + " " + isPalindrome(str2));
    }

    private static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[ ,`.]", "");
        System.out.println(str);
        String str1 = String.valueOf(new StringBuffer(str).reverse());

        System.out.println(str1 + " " + str);

        return str.equals(str1);
    }
}

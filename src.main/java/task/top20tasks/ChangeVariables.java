package task.top20tasks;

//https://itvdn.com/ru/blog/article/test-java-20

public class ChangeVariables {
    public static void main(String[] args) {
        changeVariablesWithThird();
        changeVariablesWithoutThird();
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
}

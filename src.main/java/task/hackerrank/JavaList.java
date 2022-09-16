package task.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int len = scanner.nextInt();

        for (int i = 0; i < len; i++) {
            list.add(scanner.nextInt());
        }

        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            String op = scanner.next().toLowerCase();
            if (op.equals("insert")) {
                list.add(scanner.nextInt(), scanner.nextInt());
            }
            if (op.equals("delete")) {
                list.remove(scanner.nextInt());
            }
        }

        scanner.close();
        list.forEach(e -> System.out.print(e + " "));
    }
}

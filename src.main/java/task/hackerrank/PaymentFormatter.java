package task.hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class PaymentFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        var us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        var in = NumberFormat.getCurrencyInstance(Locale.ENGLISH).format(payment).substring(1);

        var india = "Rs." + in;
        var china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        var france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

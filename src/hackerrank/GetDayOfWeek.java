package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class GetDayOfWeek {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String getDay(int day, int month, int year) {

        return LocalDate.of(year,month,day).getDayOfWeek().name();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int month = Integer.parseInt(in.readLine());
        int day = Integer.parseInt(in.readLine());
        int year = Integer.parseInt(in.readLine());

        System.out.println(getDay(day, month, year));
    }
}

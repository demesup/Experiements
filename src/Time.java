public class Time {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);
    }
}

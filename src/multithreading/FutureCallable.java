package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureCallable {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);

        // Future is a placeholder(box) for values
        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            futures.add(service.submit(new Task()));
        }

        // From placeholder to variable by future.get()
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Future<Integer> future = futures.get(i);
            try {
                results.add(future.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

        // you can use variables as you want
        results.forEach(System.out::println);
        service.shutdown();
        System.out.println(service.isShutdown());
    }
}

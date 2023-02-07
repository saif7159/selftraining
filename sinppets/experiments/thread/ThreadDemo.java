package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo {
    int x = 1;

    public void increment() {
        synchronized (this) {
            x++;
        }
    }

    public void decrement() {
        synchronized (this) {
            x--;
        }
    }

    public int getX() {
        return x;
    }

    public void testCallabe() {
        Callable<?> c = () -> {
            return Thread.currentThread().getId();
        };
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<?> id = executorService.submit(c);
        try {
            System.out.print("Current: " + Thread.currentThread().getId() + " Callable: " + id.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

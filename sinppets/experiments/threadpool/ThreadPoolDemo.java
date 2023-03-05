package threadpool;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public void run() {
        Long name = Thread.currentThread().getId();
        for (int i = 0; i < 5; i++) {
            if (i == 0)
                System.out.printf("Initialized thread %d at time %s \n", name,
                        LocalDateTime.now().format(DateTimeFormatter.ofPattern("mm:ss")));
            else
                System.out.printf("Executing thread %d at time %s \n", name,
                        LocalDateTime.now().format(DateTimeFormatter.ofPattern("mm:ss")));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        StringBuilder builder = new StringBuilder("Saif");
        System.out.printf("Execution Complete for %d \n", name);
    }

    public void executorExample() {
        Runnable r1 = this::run;
        Runnable r2 = this::run;
        Runnable r3 = this::run;
        Runnable r4 = this::run;
        Runnable r5 = this::run;

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(r1);
        executorService.execute(r2);
        executorService.execute(r3);
        executorService.execute(r4);
        executorService.execute(r5);

        executorService.shutdown();
    }

    public static void main(String[] args) {
        ThreadPoolDemo threadPoolDemo = new ThreadPoolDemo();
        threadPoolDemo.executorExample();
    }
}

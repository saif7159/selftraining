package concurrency.collection;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import concurrency.collection.model.Employee;

public class ConcurrentCollection {
    public void mapDemo() {
        // Simulate race condition
        Employee e1 = new Employee(123, "Saif",
                LocalDate.parse("24/02/1997", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        Employee e2 = new Employee(345, "Ranjit",
                LocalDate.parse("16/02/1996", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        Employee e3 = new Employee(431, "Ram",
                LocalDate.parse("21/05/1994", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        Employee e4 = new Employee(4331, "Anoy",
                LocalDate.parse("06/12/1990", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        Map<Employee, String> map = new HashMap<>();
        map.put(e1, "Microsoft");
        map.put(e2, "Delloitte");
        map.put(e3, "Amazon");
        map.put(e4, "Cognizant");
        // int[] arr = new int[];

        Thread thread1 = new Thread(() -> {
            System.out.print(Thread.currentThread().getName());
            for (int i = 0; i < 100_000_000; i++) {
                // try {
                // Thread.sleep(500);
                // } catch (InterruptedException e) {
                // // TODO Auto-generated catch block
                // e.printStackTrace();
                // }
                map.put(e4, "EY");
            }
        });
        Thread thread2 = new Thread(() -> {
            System.out.print(Thread.currentThread().getName());
            for (int i = 0; i < 100_000_000; i++) {
                // try {
                // Thread.sleep(500);
                // } catch (InterruptedException e) {
                // // TODO Auto-generated catch block
                // e.printStackTrace();
                // }
                map.put(e4, "h&m");
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(map);
    }
}

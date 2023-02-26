package thread;

public class ThreadDriver {
    public static void main(String... args) throws Exception {
        ThreadDemo threadDemo = new ThreadDemo();

        Runnable r = () -> {
            for (int i = 0; i < 500; i++) {
                // System.out.println("Increment");
                threadDemo.increment();
            }
        };

        Runnable r1 = () -> {
            for (int i = 0; i < 300; i++) {
                // System.out.println("Decrement");
                threadDemo.decrement();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r1);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(threadDemo.getX());
        threadDemo.testCallabe();
    }
}

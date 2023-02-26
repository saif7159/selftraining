
public class Main {
    public static void main(String... args) throws InterruptedException {
        ThreadImpl1 threadImpl1 = new ThreadImpl1();
        RunnableImpl1 runnableImpl1 = new RunnableImpl1();
        threadImpl1.start();
        Thread t1 = new Thread(runnableImpl1);
        t1.start();
        t1.join();
        threadImpl1.join();
        System.out.printf("%s%n%s%n%s", threadImpl1.getId(), t1.getId(), Thread.currentThread().getId());
    }
}

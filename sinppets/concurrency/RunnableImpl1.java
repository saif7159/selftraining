public class RunnableImpl1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from Thread: " + Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            SynchronizationEx.decrement();
        }
        System.out.println("x value from: " + Thread.currentThread().getId() + " - " + SynchronizationEx.getX());
    }
}

public class ThreadImpl1 extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from Thread: " + this.getName());
        for (int i = 0; i < 1000; i++) {
            SynchronizationEx.increment();
        }
        System.out.println("x value from: " + Thread.currentThread().getId() + " - " + SynchronizationEx.getX());
    }
}

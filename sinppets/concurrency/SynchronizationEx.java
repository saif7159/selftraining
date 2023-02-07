public class SynchronizationEx {
    private static int x = 0;

    public static synchronized void increment() {
        x++;
    }

    public static synchronized void decrement() {
        x--;
    }

    public static synchronized int getX() {
        return x;
    }
}

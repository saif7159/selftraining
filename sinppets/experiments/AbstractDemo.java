public abstract class AbstractDemo {
    private Integer i = 1;

    public AbstractDemo() {
        System.out.println("Base:   " + i);
    }

    public int getSquare(int x) {
        return x * x;
    }

    protected abstract void demo();
}

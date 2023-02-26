public abstract class AbstractDemo {
    int i = 1;

    public AbstractDemo() {
        System.out.println("Base:   " + i);
    }

    abstract void demo();
}

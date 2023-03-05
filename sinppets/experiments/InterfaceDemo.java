public interface InterfaceDemo {
    final static float pi = 3.14f;

    default void printPi() {
        System.out.print("Value of pi " + pi);
    }

    void printXYZ();
}

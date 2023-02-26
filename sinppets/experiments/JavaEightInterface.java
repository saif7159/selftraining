import java.util.function.Function;

@FunctionalInterface
public interface JavaEightInterface<T extends Number, S extends Number, R extends Number> {
    final int x = 12;

    R sumGen(T x, S y);

    default void sayHello() {
        System.out.print("Wassup");
    }
}

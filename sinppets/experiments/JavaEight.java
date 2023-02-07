import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaEight {
    public static String version;

    public static void setVersion(String verString) {
        version = verString;
    }

    public static void lambdaDemo() {
        Predicate<Integer> predicate = (Integer x) -> {
            if (x == 5)
                return true;
            else
                return false;
        };
        Consumer<String> consumer = JavaEight::setVersion;
        Function<Integer, Integer> function = (i) -> {
            return i * i;
        };

        BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> {
            return x * y;
        };
        function.apply(5);
        consumer.accept("Hello");
        predicate.test(5);
    }

    public static void optionalTest() {
        Optional<String> str = Optional.of("sdd");
        str.ifPresent(JavaEight::setVersion);
        String str1 = str.stream().filter(new JavaEight()::isVersioTrue).findAny().get();
        System.out.print(str1);

    }

    public static void streamsTest() {
        Integer[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };

        // Comparator<Integer> c = new Comparator<>() {
        // @Override
        // public int compare(Integer x, Integer y) {
        // x.compareTo(y);
        // }
        // };

        Arrays.sort(a, (x, y) -> {
            return y - x;
        });
        Arrays.stream(a).forEach(System.out::print);
        int s = Arrays.stream(a).parallel().reduce(0, (x, y) -> x + y / a.length);
        // reduce(0, (ans, i) -> ans + i);
        System.out.println(s);
    }

    public boolean isVersioTrue(String str) {
        return str == "sdd" ? true : false;
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static void main(String... args) {
        optionalTest();
        lambdaDemo();
        JavaEightInterface<Integer, Integer, Integer> j = JavaEight::sum;
        j.sayHello();
        System.out.println(j.sumGen(5, 7));
        streamsTest();
    }
}

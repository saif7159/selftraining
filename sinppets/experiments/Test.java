import java.security.cert.PKIXRevocationChecker.Option;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Test {
    public Optional<String> name;

    public static void main(String... args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((x, y) -> x > y ? -1 : x == y ? 0 : 1);
        priorityQueue.add(1);
        priorityQueue.add(22);
        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(5);
        // Optional<String> option = Optional<T>.of("Saif");
        // Optional<Test> optional = Optional.of(new Test());
        // Optional<String> optional2 = new Optional<String>("Saif");
        // optional.flatMap(Test::getName).get();
        // System.out.println(priorityQueue.poll());
        // System.out.println(priorityQueue.poll());
        // System.out.println(priorityQueue.poll());
        // System.out.println(priorityQueue.poll());
        // System.out.println(priorityQueue.poll());

        List<Integer> list = Arrays.asList(5, 4, 2, 6, 2);
        Collections.sort(list);
        List<Integer> transformedList = list.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(transformedList);
    }

    public Optional<String> getName() {
        return name;
    }
}

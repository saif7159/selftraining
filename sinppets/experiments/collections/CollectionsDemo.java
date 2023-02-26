package collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Spliterator;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionsDemo {
    public void listDemo() {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 6));
        list.add(1);
        list.poll();
        List<Integer> vector = new Vector<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.pop();
        stack.hashCode();
        // Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        // queue.addAll(list);
        // ArrayDeque<Integer> deque = new ArrayDeque<>(list);
        // deque.pollFirst();
        // System.out.println(queue.poll());
        HashSet<Integer> set = new HashSet<>();
        set.addAll(list);
        System.out.println(set.parallelStream().anyMatch(n -> n == 2));
        set.stream().reduce(0, (a, b) -> a + b);
        System.out.println(set);
        TreeSet<Integer> tree = new TreeSet(set);
        tree.add(null);
        Map<Integer, Integer> map = new HashMap<>();
        Spliterator<Integer> i = tree.spliterator();
        Object object;
    }

    public void iteratorDemo() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        List<Integer> newList = new ArrayList<>();
        list.stream().map(x -> x * x).spliterator().forEachRemaining(n -> newList.add(n));
        Spliterator<Integer> spliterator2 = newList.spliterator();
        spliterator2.trySplit().forEachRemaining(System.out::print);
        // list.add(8);
        System.out.println();
        // for (Integer i : linkedList) {
        // System.out.print(i);
        // linkedList.add(1);
        // }

        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(1);
        copyOnWriteArrayList.add(2);

        for (Integer i : copyOnWriteArrayList) {
            System.out.print("\n" + i);
            copyOnWriteArrayList.add(3);
        }
        System.out.print("Limit Tester");
        List<Integer> testList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        testList.add(9);
        testList.stream().limit(3).forEach(System.out::print);
    }

    // public void streamDemo() {
    // List<Integer> list = new ArrayList<>(
    // Arrays.asList(5, 3, 12, 36, 846, 5, 5, 45235, 46, 5745, 345, 25, 234,
    // 23523));
    // list.stream().mapToInt(x -> x).;
    // }
}

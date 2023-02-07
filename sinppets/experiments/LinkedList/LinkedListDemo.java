package LinkedList;

public class LinkedListDemo {
    Node<?> head;

    public static class Node<T> {
        T value;
        Node<?> next;

        public Node(T value, Node<?> next) {
            this.value = value;
            this.next = next;
        }
    }

    public void printLinkedList(Node<?> head) {
        Node<?> headRef = head;
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        head = headRef;
    }

    // 15->14->13->18
    public void reverseLinkedList(Node<?> head) {
        Node<?> head0 = null;
        Node<?> head2 = null;
        while (head.next != null) {
            head2 = head.next;
            head.next = head0;
            head0 = head;
            head = head2;
        }
        head.next = head0;
    }

}

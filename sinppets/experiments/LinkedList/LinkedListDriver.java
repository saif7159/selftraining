package LinkedList;

public class LinkedListDriver {
    public static void main(String... args) {
        LinkedListDemo linkedListDemo = new LinkedListDemo();
        LinkedListDemo.Node<Integer> node2 = new LinkedListDemo.Node<Integer>(3, null);
        LinkedListDemo.Node<Integer> node1 = new LinkedListDemo.Node<Integer>(2, null);
        LinkedListDemo.Node<Integer> nodeHead = new LinkedListDemo.Node<Integer>(1, null);
        linkedListDemo.head = nodeHead;
        nodeHead.next = node1;
        node1.next = node2;
        linkedListDemo.printLinkedList(nodeHead);
        LinkedListDemo.Node<Integer> node3 = new LinkedListDemo.Node<Integer>(4, null);
        node2.next = node3;
        System.out.println();
        linkedListDemo.reverseLinkedList(linkedListDemo.head);
        linkedListDemo.printLinkedList(linkedListDemo.head);
    }
}

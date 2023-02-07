
public class Driver{
	public static void main(String [] args){
		LinkedList ll = new LinkedList();
		ll.head = new LinkedList.Node(1);
		LinkedList.Node el2 = new LinkedList.Node(2);
		LinkedList.Node el3 = new LinkedList.Node(3);
		ll.head.next = el2;
		el2.next = el3;
		LinkedList.Node elnew = new LinkedList.Node(0);
		ll.head.next = elnew;
		elnew.next = el2;
		// ll.printList();
		ll.pushElement(88);
		ll.pushElement(77);
		// ll.printList();
		ll.insertElement(99);
		ll.printList();
		ll.insertElement(100);
		ll.printList();
		ll.insertAfterElement(3,9);
		ll.printList();
		ll.insertAfterElement(1,2);
		ll.printList();
		ll.deleteRecursive(ll.head,3);
		ll.printList();
		ll.printList();
		ll.reverseLinkedListNew(ll.head);
		ll.printList();
	}
}